package com.arstan.counterapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.arstan.counterapp.base.BaseFragment
import com.arstan.counterapp.HistoryAdapter
import com.arstan.counterapp.viewModel.ViewModel
import com.arstan.counterapp.databinding.FragmentHistoryBinding

class HistoryFragment : BaseFragment<FragmentHistoryBinding, ViewModel>() {
    lateinit var adapter: HistoryAdapter
    var info: ArrayList<String> = ArrayList<String>()
    override fun inflateViewBinding(inflater: LayoutInflater): FragmentHistoryBinding {
        binding = FragmentHistoryBinding.inflate(inflater)
        return binding
    }

    override fun initViewModel() {
        super.initViewModel()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = HistoryAdapter(viewModel.list)
        binding.recycler.adapter = adapter

    }
}
