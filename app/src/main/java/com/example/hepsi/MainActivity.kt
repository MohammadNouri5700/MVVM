package com.example.hepsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.hepsi.databinding.ActivityMainBinding
import com.example.hepsi.di.injector.ViewModelInjectors
import com.example.hepsi.factory.Resource
import com.example.hepsi.viewmodel.MainViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    @Inject
    lateinit var factory: ViewModelInjectors

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        mainViewModel = ViewModelProviders.of(this, factory)[MainViewModel::class.java]


        mainViewModel.users.observe(this, {
            when (it.status) {
                Resource.Status.SUCCESS -> {Log.e("APP","SUCCESS")}
                Resource.Status.ERROR ->{Log.e("APP","ERROR"+it.message)}
                Resource.Status.LOADING ->{ Log.e("APP","LOADING")} }
        })

        mainViewModel.getuserData()
    }
}