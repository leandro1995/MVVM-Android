package com.leandro1995.mvvmandroid.extension

import android.app.Activity

infix fun String.putExtra(activity: Activity): String = activity.intent.extras!!.getString(this)!!