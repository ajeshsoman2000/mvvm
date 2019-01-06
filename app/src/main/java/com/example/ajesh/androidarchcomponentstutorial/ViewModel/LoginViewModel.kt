package com.example.ajesh.androidarchcomponentstutorial.ViewModel

import android.arch.lifecycle.ViewModel
import android.content.Context
import android.content.SharedPreferences
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import com.example.ajesh.androidarchcomponentstutorial.LoginActivity
import com.example.ajesh.androidarchcomponentstutorial.LoginResultCallback
import com.example.ajesh.androidarchcomponentstutorial.Model.User
import com.example.ajesh.androidarchcomponentstutorial.Utils.USER_DETAIL_PREF
import com.example.ajesh.androidarchcomponentstutorial.Utils.USER_ID

class LoginViewModel(private var loginListener: LoginResultCallback): ViewModel() {

    var user: User? = null

    init {
        user = User("", "")
    }

    var userIdTextWatcher = object : TextWatcher {
        override fun afterTextChanged(userId: Editable?) {
            user?.userId = userId.toString()
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

    }

    var passwordTextWatcher = object : TextWatcher {
        override fun afterTextChanged(password: Editable?) {
            user?.password = password.toString()
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }
    }

    fun onLoginClicked(v: View) {
        if (user?.isValidUserid() as Boolean && user?.isValidPassword() as Boolean) {
            (loginListener as LoginActivity).getSharedPreferences(USER_DETAIL_PREF, Context.MODE_PRIVATE).edit().putString(
                USER_ID, (user as User).userId).apply()
            loginListener.onSuccess("Login Successful.")
        } else {
            loginListener.onError("Login failed.")
        }
    }
}