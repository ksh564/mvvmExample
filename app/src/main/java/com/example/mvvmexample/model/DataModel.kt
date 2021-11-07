package com.example.mvvmexample.model

import com.example.mvvmexample.model.enum.KaKaoSearchSort
import com.example.mvvmexample.model.response.ImageSearchResponse
import io.reactivex.rxjava3.core.Single

interface DataModel {
    fun getData(query:String, sort:KaKaoSearchSort,page:Int, size:Int) : Single<ImageSearchResponse>
}