package com.example.ajesh.androidarchcomponentstutorial

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ajesh.androidarchcomponentstutorial.ViewModel.LoginViewModel
import com.example.ajesh.androidarchcomponentstutorial.ViewModel.LoginViewModelFactory
import com.example.ajesh.androidarchcomponentstutorial.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), LoginResultCallback {
    override fun onSuccess(message: String) {
        Toast.makeText(this@LoginActivity, message, Toast.LENGTH_LONG).show()
        startActivity(Intent(this@LoginActivity, HomeActivity::class.java))
    }

    override fun onError(error: String) {
        Toast.makeText(this@LoginActivity, error, Toast.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityLoginBinding = DataBindingUtil.setContentView<ActivityLoginBinding>(this@LoginActivity, R.layout.activity_login)
        activityLoginBinding.viewModel = ViewModelProviders.of(this@LoginActivity,
            LoginViewModelFactory(this)).get(LoginViewModel::class.java)
    }
}
