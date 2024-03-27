package com.prokopov.hometask.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.prokopov.core.data.Resource
import com.prokopov.network.NetworkResources
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PlanetsViewModel @Inject constructor(
    private val networkResources: NetworkResources
): ViewModel() {

    private val initialDataLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()
    private val loadingStateLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()
    private val errorStateLiveData: MutableLiveData<Resource.ErrorDesc> = MutableLiveData<Resource.ErrorDesc>()

    val initialData: LiveData<Boolean>
        get() = initialDataLiveData

    val loadingState: LiveData<Boolean>
        get() = loadingStateLiveData

    val errorState: LiveData<Resource.ErrorDesc>
        get() = errorStateLiveData

}