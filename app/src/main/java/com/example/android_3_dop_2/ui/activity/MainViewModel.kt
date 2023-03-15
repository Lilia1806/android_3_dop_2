package com.example.android_3_dop_2.ui.activity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MainViewModel : ViewModel() {

    private var list: MutableLiveData<Int> = MutableLiveData()

    fun getRandomNumber(): MutableLiveData<Int> {
        val randomInt = Random.nextInt(1000)
        list.value = randomInt
        return list
    }
}