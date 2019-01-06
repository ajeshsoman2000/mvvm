package com.example.ajesh.androidarchcomponentstutorial.ViewModel

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.example.ajesh.androidarchcomponentstutorial.LoginResultCallback

class LoginViewModelFactory(val loginListener: LoginResultCallback): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(loginListener) as T
    }
}