package com.example.mvvmexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmexample.base.BaseKotlinViewModel
import com.example.mvvmexample.model.DataModel
import com.example.mvvmexample.model.enum.KaKaoSearchSort
import com.example.mvvmexample.model.response.ImageSearchResponse
import io.reactivex.rxjava3.schedulers.Schedulers

class MainViewModel(private val model:DataModel) : BaseKotlinViewModel() {
    private val TAG = "MainViewModel"

    private val _imageSearchResponseLiveData = MutableLiveData<ImageSearchResponse>()
    val imageSearchResponseData : LiveData<ImageSearchResponse>

    get() = _imageSearchResponseLiveData

    fun getImageSearch(query:String, page:Int, size: Int){
        addDisposable(model.getData(query,KaKaoSearchSort.ACCURACY, page, size)
            .subscribeOn(Schedulers.io())
            .observeOn(main))
    }

}