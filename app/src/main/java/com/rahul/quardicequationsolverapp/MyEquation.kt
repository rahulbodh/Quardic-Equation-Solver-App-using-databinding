package com.rahul.quardicequationsolverapp

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.rahul.quardicequationsolverapp.databinding.ActivityMainBinding

class MyEquation : BaseObservable() {

    @Bindable
    var a : String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.a)
        }
    @Bindable
    var b : String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.b)
        }
    var c : String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.c)
        }

    private lateinit var binding : ActivityMainBinding
}