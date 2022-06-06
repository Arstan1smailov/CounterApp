package com.arstan.counterapp.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.arstan.counterapp.Base.BaseFragment
import com.arstan.counterapp.ViewModel.ViewModel
import com.arstan.counterapp.databinding.FragmentCounterBinding
import com.arstan.counterapp.ui.home.ValueFragment

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