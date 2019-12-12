package com.leandro1995.mvvmandroid.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.leandro1995.mvvmandroid.R

class UserViewModel : ViewModel() {

    val activityMutable: MutableLiveData<Pair<String, String>> by lazy {
        MutableLiveData<Pair<String, String>>()
    }

    val messageMutable: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    var user = ""
    var password = ""

    fun loginUser() {
        if (user == "leandro" && password == "12345678") {
            activityMutable.value = Pair("Leandro", "Castillo")
        } else {
            messageMutable.value = R.string.verify_user_message
        }
    }
}