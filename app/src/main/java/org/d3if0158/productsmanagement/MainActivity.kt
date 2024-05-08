package org.d3if0158.productsmanagement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import org.d3if0158.productsmanagement.navigation.SetupNavGraph
import org.d3if0158.productsmanagement.screen.MainScreen
import org.d3if0158.productsmanagement.ui.theme.ProductsManagementTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProductsManagementTheme {
                SetupNavGraph()
            }
        }
    }
}