package com.example.aop_part3_chapter02_remote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private val viewPager : ViewPager2 by lazy {
        findViewById(R.id.viewPager)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
initView()

    }

    private fun initView() {
        viewPager.adapter=QuotesPagerAdapter(listOf(Quote("나는 생각한다. 고로 나는 존재한다.",
        "데카르트")))
    }
}