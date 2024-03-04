package com.prokopov.hometask.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.prokopov.core.ui.BaseViewBindingFragment
import com.prokopov.hometask.databinding.FragmentSplashBinding
import com.prokopov.hometask.viewmodel.SplashViewModel

class SplashFragment : BaseViewBindingFragment<FragmentSplashBinding>() {

    private val viewModel by viewModels<SplashViewModel>()

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        attachedToRoot: Boolean,
        savedInstanceState: Bundle?
    ): FragmentSplashBinding {
        return FragmentSplashBinding.inflate(inflater, container, attachedToRoot)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    companion object {
        const val TAG = "SplashFragment"
    }
}