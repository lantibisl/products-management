package org.d3if0158.productsmanagement.navigation

import org.d3if0158.productsmanagement.screen.KEY_ID_PRODUK

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")

    data object FormBaru: Screen("detailScreen")

    data object FormUbah: Screen("detailScreen/{$KEY_ID_PRODUK}") {
        fun withId(id: Long) = "detailScreen/$id"
    }
}