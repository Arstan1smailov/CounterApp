package com.arstan.counterapp.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.arstan.counterapp.Base.BaseFragment
import com.arstan.counterapp.ViewModel.ViewModel
import com.arstan.counterapp.databinding.FragmentHistoryBinding

class HistoryFragment : BaseFragment<FragmentHistoryBinding, ViewModel>() {
    override fun inflateViewBinding(inflater: LayoutInflater): FragmentHistoryBinding {
        binding = FragmentHistoryBinding.inflate(inflater)
        return binding
    }

}