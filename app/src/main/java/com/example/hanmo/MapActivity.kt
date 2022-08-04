package com.example.hanmo

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_map.*

class MapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        /*
        val backwardBtn = findViewById<ImageButton>(R.id.backward_btn)
        backwardBtn.setOnClickListener {

        }
         */


        val parkimage_Map:ImageView = findViewById(R.id.parkimage_iv)
        val parkImage = intent.extras!!.getInt("parkId")

        parkimage_Map.setImageResource(parkImage)

    }
}