package com.leandro1995.mvvmandroid.viewmodel

import android.content.Intent
import androidx.lifecycle.MutableLiveData

class UserViewModel {

    val activityMutable: MutableLiveData<Intent> by lazy {
        MutableLiveData<Intent>()
    }
}