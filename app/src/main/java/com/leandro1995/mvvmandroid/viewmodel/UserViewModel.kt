package com.leandro1995.mvvmandroid.viewmodel

import android.content.Intent
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    val activityMutable: MutableLiveData<Intent> by lazy {
        MutableLiveData<Intent>()
    }

    val messageMutable:MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    var user = ""
    var password = ""

    fun loginUser()
    {
        if(user == "leandro" && password == "12345678")
        {

        }
        else
        {
            messageMutable.value = "Usuario o contraseña no son correctas"
        }
    }
}