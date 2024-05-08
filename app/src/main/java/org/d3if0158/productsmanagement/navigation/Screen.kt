package org.d3if0158.productsmanagement.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
}