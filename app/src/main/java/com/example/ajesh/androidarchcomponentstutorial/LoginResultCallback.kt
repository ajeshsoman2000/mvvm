package com.example.ajesh.androidarchcomponentstutorial

interface LoginResultCallback {
    fun onSuccess(message: String)
    fun onError(error: String)
}