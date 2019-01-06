package com.example.ajesh.androidarchcomponentstutorial

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ajesh.androidarchcomponentstutorial.ViewModel.HomeViewModel
import com.example.ajesh.androidarchcomponentstutorial.ViewModel.HomeViewModelFactory
import com.example.ajesh.androidarchcomponentstutorial.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val homeDataBinding = DataBindingUtil.setContentView<ActivityHomeBinding>(this@HomeActivity, R.layout.activity_home)
        homeDataBinding.viewModel = ViewModelProviders.of(this@HomeActivity, HomeViewModelFactory(this@HomeActivity))
            .get(HomeViewModel::class.java)
    }
}
