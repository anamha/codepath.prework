package com.example.helloanam

import android.annotation.SuppressLint
import android.graphics.Color.*
import android.hardware.camera2.params.RggbChannelVector.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//import android.widget.TextView

// main kotlin file we are going to be using

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Show this layout file: activity_main
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.button).setOnClickListener {

            Log.i("Anam", "Tapped on Button")

            findViewById<TextView>(R.id.textView).setTextColor(R.color.white)




        }
        // 2. set up logic to know when user has tapped on button
            //- change color of the text

    }
}