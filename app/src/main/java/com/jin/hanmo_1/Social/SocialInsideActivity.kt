package com.jin.hanmo_1.Social

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.jin.hanmo_1.R
import com.jin.hanmo_1.databinding.ActivitySocialInsideBinding

class SocialInsideActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySocialInsideBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_social_inside)

        //SocialActivity에서 받은 title,content 문자열로 바꿔서 화면에 보이기
        val title = intent.getStringExtra("title").toString()
        val content = intent.getStringExtra("content").toString()

        //activity_social_inside에서의 배치에 맞게 설정
        binding.showTitle.text=title
        binding.showContent.text=content
    }
}
