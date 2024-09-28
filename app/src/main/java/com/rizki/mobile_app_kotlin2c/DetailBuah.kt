package com.rizki.mobile_app_kotlin2c

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailBuah : AppCompatActivity() {

    private lateinit var txtDetailBuah : TextView
    private lateinit var imgDetailBuah : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        txtDetailBuah = findViewById(R.id.txtDetailNamaBuah)
        imgDetailBuah = findViewById(R.id.imgDetailBuah)

        //get data
        val detailText = intent.getStringExtra("nama")
        val detailImg = intent.getIntExtra("image", 0)

        //set data ke widget
        txtDetailBuah.setText(detailText)
        imgDetailBuah.setImageResource(detailImg)

        //TASK SELANJUTNYA
        //PADA MOVIE --> TAMBAHKAN DETAIL MOVIE
        //PADA DETAIL TAMPILKAN GAMBAR DAN JUDUL MOVIE

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}