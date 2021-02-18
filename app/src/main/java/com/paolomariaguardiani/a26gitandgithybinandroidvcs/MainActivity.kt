package com.paolomariaguardiani.a26gitandgithybinandroidvcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Our first Project on Github

        val text = findViewById<TextView>(R.id.text_view)
        val button = findViewById<TextView>(R.id.btn)
        val image = findViewById<ImageView>(R.id.image)

    }
}