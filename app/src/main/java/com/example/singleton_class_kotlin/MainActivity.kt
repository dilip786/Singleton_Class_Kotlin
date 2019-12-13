package com.example.singleton_class_kotlin

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var context:Context;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = this

        MySingleton.printText()
        
        MySingleton.sampleText = "First"
        MySingleton.printText()

        MySingleton.sampleText = "Second"
        MySingleton.printText()
    }
}
