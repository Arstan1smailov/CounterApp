package com.arstan.counterapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.Observer
import com.arstan.counterapp.base.BaseFragment
import com.arstan.counterapp.viewModel.ViewModel
import com.arstan.counterapp.databinding.FragmentCounterBinding

class CounterFragment :
    BaseFragment<FragmentCounterBinding, ViewModel>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentCounterBinding {
        binding = FragmentCounterBinding.inflate(inflater)
        return binding
    }
    override fun initViewModel() {
        super.initViewModel()

    }

    override fun initListener() {
        super.initListener()
        viewModel.onIncreaseClick()
        viewModel.onDecreaseClick()
       viewModel.counter.observe(this, Observer{ counter->
           binding.tvTitle.text = counter.toString()
       })
    }

}