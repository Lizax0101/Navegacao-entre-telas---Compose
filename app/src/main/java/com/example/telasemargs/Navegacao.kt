package com.example.telasemargs

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navegacao() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = TelaUm1) {

        composable<TelaUm1> {
            //minha função
            TelaUm(navegarParaDois = { navController.navigate(TelaDois2) })

        }

        composable<TelaDois2> {
            TelaDois(navegarPara3 = { navController.navigate(TelaTres3) })

        }

        composable<TelaTres3> {
            TelaTres(voltarParaUm = { navController.popBackStack(TelaUm1, inclusive = false) })
        }

    }
}