package ru.skillbranch.awesomeapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            Log.e("test", "1pressed")
        }
        button2.setOnClickListener {
            Log.e("test", "2pressed")
        }
        button3.setOnClickListener {
            Log.e("test", "3pressed")
        }
        button4.setOnClickListener {
            Log.e("test", "4pressed")
        }






    }
}