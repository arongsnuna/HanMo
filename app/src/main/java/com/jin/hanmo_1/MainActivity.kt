package com.jin.hanmo_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.jin.hanmo_1.Social.SocialActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //사용자 아이콘 클릭 -> 마이페이지 이동
        val mypage = findViewById<ImageView>(R.id.user)
        mypage.setOnClickListener {
            val intent = Intent(this,MypageActivity::class.java)
            startActivity(intent)
        }

        //지구본 아이콘 클릭 -> 게시판 이동
        val social = findViewById<ImageView>(R.id.social)
        social.setOnClickListener {
            val intent = Intent(this, SocialActivity::class.java)
            startActivity(intent)
        }

        // ex) 1. 강서지구 클릭 -> map_1로 이동
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btn10 = findViewById<Button>(R.id.btn10)
        val btn11 = findViewById<Button>(R.id.btn11)
        val btn12 = findViewById<Button>(R.id.btn12)

        //버튼 아이디에 따라 "1"의 값이 MapActivity 로 전달 -> 해당 지역 지도 확대
        btn1.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "1")
            startActivity(intent)
        }

        btn2.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "2")
            startActivity(intent)
        }

        btn3.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "3")
            startActivity(intent)
        }

        btn4.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "4")
            startActivity(intent)
        }

        btn5.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "5")
            startActivity(intent)
        }

        btn6.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "6")
            startActivity(intent)
        }

        btn7.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "7")
            startActivity(intent)
        }

        btn8.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "8")
            startActivity(intent)
        }

        btn9.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "9")
            startActivity(intent)
        }

        btn10.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "10")
            startActivity(intent)
        }

        btn11.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "11")
            startActivity(intent)
        }

        btn12.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            intent.putExtra("data", "12")
            startActivity(intent)
        }
    }
}