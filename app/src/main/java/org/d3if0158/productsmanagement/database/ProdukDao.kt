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

    @Query("SELECT * FROM produk ORDER BY nama")
    fun getProduk(): Flow<List<Produk>>

    @Query("SELECT * FROM produk WHERE id = :id")
    suspend fun getProdukById(id: Long): Produk?

    @Query("DELETE FROM produk WHERE id = :id")
    suspend fun deleteById(id: Long)
}