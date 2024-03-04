package com.prokopov.hometask.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prokopov.core.ui.BaseViewBindingFragment
import com.prokopov.hometask.databinding.FragmentSplashBinding
import javax.inject.Inject

class SplashFragment : BaseViewBindingFragment<FragmentSplashBinding>() {

    companion object {
        const val TAG = "SplashFragment"
    }

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
}