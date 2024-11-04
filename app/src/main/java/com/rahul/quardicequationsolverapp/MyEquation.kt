package com.rahul.quardicequationsolverapp

import android.view.View
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

    fun solveEquation(view : View) {

        val a = a.toInt()
        val b = b.toInt()
        val c = c.toInt()

        val discriminant = b*b - 4*a*c
        if(discriminant < 0) {
            binding.answerTextView.text = "No solution"

        }else if(discriminant > 0) {
            val root = Math.sqrt(discriminant.toDouble())
            val x1 = (-b + root)/(2*a)
            val x2 = (-b - root)/(2*a)

            binding.answerTextView.text = "x1 = $x1, x2 = $x2"
        }else {
            val x = -b/(2*a)
            binding.answerTextView.text = "x = $x"
        }

    }
}