package com.example.singleton_class_kotlin

import android.util.Log

object MySingleton {

    var sampleText = "Android - Java"

    init {
        Log.e("Singleton", "init block called")
    }

    fun printText() {
        Log.e("Singleton", sampleText)
    }
}