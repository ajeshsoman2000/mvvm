package com.example.ajesh.androidarchcomponentstutorial.Model

import android.databinding.BaseObservable
import java.lang.NumberFormatException

class User(var userId: String, var password: String): BaseObservable() {


    fun isValidUserid(): Boolean {
        return if (!userId.isNullOrEmpty()) {
            val first3CharsOfId = userId.slice(0..2)
            try {
                first3CharsOfId.toInt()
                true
            } catch (e: NumberFormatException){
                false
            }
        } else {
            false
        }
    }

    fun isValidPassword(): Boolean = !password.isNullOrEmpty()
}