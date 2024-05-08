package org.d3if0158.productsmanagement.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "produk")
data class Produk(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val nama: String,
    val kategori: String,
    val stok: Int
)