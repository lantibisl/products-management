package org.d3if0158.productsmanagement.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import org.d3if0158.productsmanagement.model.Produk

@Dao
interface ProdukDao {
    @Insert
    suspend fun insert(produk: Produk)

    @Update
    suspend fun update(produk: Produk)

    @Query("SELECT * FROM produk")
    fun getProduk(): Flow<List<Produk>>
}