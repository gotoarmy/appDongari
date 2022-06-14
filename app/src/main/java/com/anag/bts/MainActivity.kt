package com.anag.bts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 클릭시 안드로이드 스튜디오가 알게함
        val image1 = findViewById<ImageView>(R.id.image_1);
        image1.setOnClickListener{
            Toast.makeText(this,"클릭 완료",Toast.LENGTH_LONG)
        }
    }
}