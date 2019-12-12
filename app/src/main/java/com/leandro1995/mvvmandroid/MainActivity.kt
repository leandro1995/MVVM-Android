package com.leandro1995.mvvmandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.leandro1995.mvvmandroid.activity.LoginResponseActivity
import com.leandro1995.mvvmandroid.config.Setting
import com.leandro1995.mvvmandroid.databinding.ActivityMainBinding
import com.leandro1995.mvvmandroid.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainBinding.userModel = userViewModel
        mainBinding.executePendingBindings()

        observer()
    }

    private fun observer() {
        userViewModel.activityMutable.observe(this, Observer {
            startActivity(Intent(this, LoginResponseActivity::class.java).apply {
                putExtra(Setting.NAME, it.first)
                putExtra(Setting.SUR_NAME, it.second)
            })
        })

        userViewModel.messageMutable.observe(this, Observer {
            Toast.makeText(this, getString(it), Toast.LENGTH_SHORT).show()
        })
    }
}