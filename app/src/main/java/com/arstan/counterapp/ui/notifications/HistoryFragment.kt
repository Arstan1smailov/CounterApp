package com.arstan.counterapp.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.arstan.counterapp.Base.BaseFragment
import com.arstan.counterapp.ViewModel.ViewModel
import com.arstan.counterapp.databinding.FragmentHistoryBinding

class HistoryFragment : BaseFragment<FragmentHistoryBinding, ViewModel>() {
    override fun inflateViewBinding(inflater: LayoutInflater): FragmentHistoryBinding {
        binding = FragmentHistoryBinding.inflate(inflater)
        return binding
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}