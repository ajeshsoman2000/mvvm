package com.example.ajesh.androidarchcomponentstutorial.ViewModel

import android.arch.lifecycle.ViewModel
import android.content.Context
import com.example.ajesh.androidarchcomponentstutorial.HomeActivity
import com.example.ajesh.androidarchcomponentstutorial.Utils.USER_DETAIL_PREF
import com.example.ajesh.androidarchcomponentstutorial.Utils.USER_ID

class HomeViewModel(private var context: Context): ViewModel() {

    fun getUserLoggedInId(): String = "Welcome \n ${(context as HomeActivity).getSharedPreferences(USER_DETAIL_PREF, Context.MODE_PRIVATE)
        .getString(USER_ID, "")}"
}