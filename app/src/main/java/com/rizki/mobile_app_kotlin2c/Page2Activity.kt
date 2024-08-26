package com.rizki.mobile_app_kotlin2c

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page2Activity : AppCompatActivity() {

    private  lateinit var txtHasil : TextView
    private lateinit var btnSubmit : Button
    private lateinit var etUsername : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page2)

        txtHasil = findViewById(R.id.txtHasil)
        btnSubmit = findViewById(R.id.btnSubmit)
        etUsername = findViewById(R.id.etUsername)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnSubmit.setOnClickListener(){
            //widget secara default ini adalah object
            val nUsername = etUsername.text
            txtHasil.setText("Hello $nUsername! Selamat datang di MI 2 C")

        }
    }
}