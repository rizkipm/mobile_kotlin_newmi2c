package com.rizki.mobile_app_kotlin2c

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {
    private lateinit var  lv_data : ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)

        lv_data = findViewById(R.id.lv_data)

        //listview
        //widget listview --> Array Adapter --> Data Source (Array/list/Database)

        //bikin array list
        val namaHewan = listOf(
            "Gajah",
            "Kuda",
            "Beruang",
            "Panda",
            "Ular",
            "Kucing",
            "Sapi",
            "Kerbau",
            "Ikan"
        )
        //memasukkan data array ini ke dalam adapter
        //android layout --> layout bawaan untuk di adapter
        lv_data.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namaHewan)

        //untuk bisa di klik dari list
        lv_data.setOnItemClickListener{
            parent, view, position, id ->
            Toast.makeText(this, "Anda Memilih : ${namaHewan[position]}",
                Toast.LENGTH_SHORT).show()

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}