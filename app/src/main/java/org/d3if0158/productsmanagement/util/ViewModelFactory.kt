package org.d3if0158.productsmanagement.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import org.d3if0158.productsmanagement.database.ProdukDao
import org.d3if0158.productsmanagement.screen.DetailViewModel
import org.d3if0158.productsmanagement.screen.MainViewModel

class ViewModelFactory(private val dao: ProdukDao) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(dao) as T
        } else if (modelClass.isAssignableFrom(DetailViewModel::class.java)) {
            return DetailViewModel(dao) as T
        }
        throw IllegalArgumentException("Unkown ViewModel Class")
    }
}