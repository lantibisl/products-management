package org.d3if0158.productsmanagement.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.d3if0158.productsmanagement.database.ProdukDao
import org.d3if0158.productsmanagement.model.Produk

class DetailViewModel(private val dao: ProdukDao) : ViewModel() {

    fun insert(nama: String, kategori: String, stok: Int) {
        val produk = Produk(
            nama = nama,
            kategori = kategori,
            stok = stok
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.insert(produk)
        }
    }

    suspend fun getProduk(id: Long): Produk? {
        return dao.getProdukById(id)
    }

    fun update(id: Long, nama: String, kategori: String, stok: Int) {
        val produk = Produk(
            id = id,
            nama = nama,
            kategori = kategori,
            stok = stok
        )

        viewModelScope.launch(Dispatchers.IO) {
            dao.update(produk)
        }
    }

    fun delete(id: Long) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.deleteById(id)
        }
    }
}