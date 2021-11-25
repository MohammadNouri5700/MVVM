package com.example.hepsi.viewmodel


import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hepsi.factory.Resource
import com.example.hepsi.repository.entity.UserEntity
import com.example.hepsi.repository.remote.RemoteDataSource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repository:RemoteDataSource,
    private val context: Context
): ViewModel() {




    val users = MutableLiveData<Resource<UserEntity>>()



    fun getuserData(){
        CoroutineScope(Dispatchers.IO).launch {
            val response = repository.getusers()
            users.postValue(response)
        }
    }

    private fun onError(message: String) {
        Log.e("APP","onError")
        Toast.makeText(context, "onError  $message", Toast.LENGTH_SHORT).show()
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("APP","onCleared")
        Toast.makeText(context, "onCleared", Toast.LENGTH_SHORT).show()
    }



}