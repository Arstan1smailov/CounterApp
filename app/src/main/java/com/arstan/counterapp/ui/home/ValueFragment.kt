package com.arstan.counterapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.arstan.counterapp.Base.BaseFragment
import com.arstan.counterapp.ViewModel.ViewModel
import com.arstan.counterapp.databinding.FragmentValueBinding
import com.arstan.counterapp.ui.dashboard.CounterFragment

class ValueFragment : BaseFragment<FragmentValueBinding, ViewModel>() {
    public var list: ArrayList<String> = ArrayList()
    public var number = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
    override fun initViewModel() {
        super.initViewModel()

    }

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