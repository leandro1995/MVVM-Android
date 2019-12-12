package com.leandro1995.mvvmandroid.viewmodel

import androidx.lifecycle.ViewModel

class LoginResponseViewModel : ViewModel() {

    var name = ""
    var surName = ""

    fun showData(namePutExtra: String, surNamePutExtra: String) {
        name = namePutExtra
        surName = surNamePutExtra
    }
}