package org.d3if0158.productsmanagement.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import org.d3if0158.productsmanagement.database.ProdukDao
import org.d3if0158.productsmanagement.model.Produk

class MainViewModel(dao: ProdukDao) : ViewModel() {
    val data: StateFlow<List<Produk>> = dao.getProduk().stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000L),
        initialValue = emptyList()
    )

}