package com.example.pertemuan5

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("USERNAME", intent.getStringExtra("USERNAME"))
            intent.putExtra("EMAIL", intent.getStringExtra("EMAIL"))
            intent.putExtra("PHONE", intent.getStringExtra("PHONE"))
            intent.putExtra("GENDER", intent.getStringExtra("GENDER"))
            startActivity(intent)
        }
    }
}
