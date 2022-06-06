package com.arstan.counterapp.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding, VM: ViewModel>: Fragment(){

    protected lateinit var binding: VB
    protected val viewModel: com.arstan.counterapp.viewModel.ViewModel by activityViewModels()

    protected abstract fun inflateViewBinding(inflater: LayoutInflater): VB

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = inflateViewBinding(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // checkInternet()
        initViewModel()
        initView()
        initListener()
    }

   // open fun checkInternet(){}

    open fun initViewModel(){
    }

    open fun initView(){}

    open fun initListener(){}
}