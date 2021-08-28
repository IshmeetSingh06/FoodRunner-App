package com.ishidon.assignment4.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo

class connectionManager {
    fun isNetworkAvailable(context: Context): Boolean{
        val connectivityManager=context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo : NetworkInfo? = connectivityManager.activeNetworkInfo
        return (activeNetworkInfo!=null && activeNetworkInfo.isConnectedOrConnecting)
    }
}