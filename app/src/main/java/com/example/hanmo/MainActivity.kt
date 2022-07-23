package com.example.hanmo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var parknameAdaptor: ParknameAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        parknameAdaptor = ParknameAdaptor(mutableListOf())

        parkList_lv.adapter = parknameAdaptor
        // layout manager
        parkList_lv.layoutManager = LinearLayoutManager(this)

    }
}