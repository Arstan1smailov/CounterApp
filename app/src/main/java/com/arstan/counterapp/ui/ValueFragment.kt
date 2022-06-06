package com.arstan.counterapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arstan.counterapp.base.BaseFragment
import com.arstan.counterapp.viewModel.ViewModel
import com.arstan.counterapp.databinding.FragmentValueBinding

class ValueFragment : BaseFragment<FragmentValueBinding, ViewModel>() {
    public var list: ArrayList<String> = ArrayList()
    public var number = 0

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentValueBinding {
        binding = FragmentValueBinding.inflate(inflater)
        return binding
    }

    override fun initListener() {
        super.initListener()
        binding.btnMinus.setOnClickListener {
            viewModel.onDecreaseClick()
            viewModel.list.add("-")

        }
        binding.btnPlus.setOnClickListener {
            viewModel.onIncreaseClick()
            viewModel.list.add("+")
        }

    }
}