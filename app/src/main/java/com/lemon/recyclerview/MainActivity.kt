package com.lemon.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val rv_profile: RecyclerView by lazy{
        findViewById(R.id.rv_profile)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.man, "사용자 이름", 28, "테스트"), // sample profile list
            Profiles(R.drawable.woman, "가나다", 22, "Sample"),
            Profiles(R.drawable.man, "마바사", 32, "샘플"),
            Profiles(R.drawable.man, "ABC", 17, "Tester"),
            Profiles(R.drawable.woman, "Andorid", 44, "kotiln"),
            Profiles(R.drawable.woman, "Java", 38, "JVM")

        )
        rv_profile.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter = ProfileAdapter(profileList)
    }
}