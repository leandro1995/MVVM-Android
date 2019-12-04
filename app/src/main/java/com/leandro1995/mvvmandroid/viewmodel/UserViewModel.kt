package com.leandro1995.mvvmandroid.viewmodel

import android.content.Intent
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    val activityMutable: MutableLiveData<Intent> by lazy {
        MutableLiveData<Intent>()
    }
}