package org.d3if0158.productsmanagement.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import org.d3if0158.productsmanagement.model.Produk

@Database(entities = [Produk::class], version = 1, exportSchema = false)
abstract class ProdukDb : RoomDatabase() {

    abstract val dao: ProdukDao

    companion object {

        @Volatile
        private var INSTANCE: ProdukDb? = null

        fun getInstance(context: Context): ProdukDb {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ProdukDb::class.java,
                        "mahasiswa.db"
                    ).build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }

}