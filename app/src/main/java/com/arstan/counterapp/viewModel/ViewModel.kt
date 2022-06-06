package com.arstan.counterapp.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel: ViewModel() {
    private var mCounter = 0
    var list = ArrayList<String>()
    val counter = MutableLiveData<Int>()

    fun onIncreaseClick(){
        mCounter++
        counter.value = mCounter
    }
    fun onDecreaseClick(){
        mCounter--
        counter.value = mCounter
    }


}