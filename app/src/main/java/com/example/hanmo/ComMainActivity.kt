package com.example.hanmo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ComMainActivity : AppCompatActivity() {

    private lateinit var writeBtn : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_com_main)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        // Write Button
        writeBtn = findViewById(R.id.write_btn)
        setWriteClickListener()

    }

    private fun setWriteClickListener() {
        writeBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@ComMainActivity, ComWritePostActivity::class.java)
            startActivity(intent)
        })
    }
}