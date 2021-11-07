package com.example.mvvmexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil.setContentView
import com.example.mvvmexample.base.BaseKotlinActivity
import com.example.mvvmexample.databinding.ActivityMainBinding

class MainActivity : BaseKotlinActivity<ActivityMainBinding,Mainv> {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}