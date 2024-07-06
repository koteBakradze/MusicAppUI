package com.example.musicappui

import androidx.annotation.DrawableRes

sealed class Screen(val title: String, val root:String) {
    sealed class DrawerScreen(val dTitle: String, val dRoute: String, @DrawableRes val icon: Int)
        : Screen(dTitle, dRoute){
            object Account: DrawerScreen(
                "Account",
                "account",
                R.drawable.ic_account
            )
            object Subscribe: DrawerScreen(
                "Subscription",
                "subscribe",
                R.drawable.ic_subscribe
            )
            object AddAccount: DrawerScreen(
                "Add Account",
                "add_account",
                R.drawable.baseline_person_add_alt_1_24
            )
        }
}