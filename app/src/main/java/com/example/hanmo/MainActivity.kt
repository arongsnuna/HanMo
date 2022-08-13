package com.example.hanmo

import android.R.layout.*
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_park.*


class MainActivity : AppCompatActivity() {

    private lateinit var parknameAdaptor: ParknameAdaptor
    private lateinit var communityBtn: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Park Buttons
        parknameAdaptor = ParknameAdaptor(mutableListOf<Button>())
        parknameAdaptor.initButtons()

        parkList_rv.adapter = parknameAdaptor

        setParkClickListener()
        /* layout manager */
        parkList_rv.layoutManager = LinearLayoutManager(this)

        // Community Button
        communityBtn = findViewById(R.id.community_btn)
        setCommunityClickListener()
    }

    private fun setParkClickListener() {
        parknameAdaptor.setOnItemClickListener(object : ParknameAdaptor.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@MainActivity, MapActivity::class.java)
                intent.putExtra("parkId", position)
                startActivity(intent)
            }
        })
    }

    private fun setCommunityClickListener() {
        communityBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, ComMainActivity::class.java)
            startActivity(intent)
        })
    }

}