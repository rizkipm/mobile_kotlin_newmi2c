package com.rizki.mobile_app_kotlin2c

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomePageAcitivity : AppCompatActivity() {

    private lateinit var  txtWelcome : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page_acitivity)
        txtWelcome = findViewById(R.id.txtWelcome)
        //get data yang telah di put extras intent

        val getDataUsername = intent.getStringExtra("username")
        val getDataPassword = intent.getStringExtra("password")
        //tampilkan hasil setelah di get
        txtWelcome.setText("Hello ${getDataUsername}!\n Password anda adalah : ${getDataPassword}")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}