package com.leandro1995.mvvmandroid.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.leandro1995.mvvmandroid.R
import com.leandro1995.mvvmandroid.config.Setting
import com.leandro1995.mvvmandroid.databinding.ActivityLoginResponseBinding
import com.leandro1995.mvvmandroid.extension.putExtra
import com.leandro1995.mvvmandroid.viewmodel.LoginResponseViewModel

class LoginResponseActivity : AppCompatActivity() {

    private lateinit var loginResponseBinding: ActivityLoginResponseBinding
    private lateinit var loginResponseViewModel: LoginResponseViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loginResponseViewModel = ViewModelProviders.of(this).get(LoginResponseViewModel::class.java)

        observer()

        loginResponseBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_login_response)
        loginResponseBinding.loginResponseModel = loginResponseViewModel
        loginResponseBinding.executePendingBindings()
    }

    private fun observer() {
        loginResponseViewModel.showData(
            namePutExtra = Setting.NAME putExtra this,
            surNamePutExtra = Setting.SUR_NAME putExtra this
        )
    }
}