package com.example.pertemuan5

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val username = intent.getStringExtra("USERNAME")
        val email = intent.getStringExtra("EMAIL")
        val phone = intent.getStringExtra("PHONE")
        val gender = intent.getStringExtra("GENDER")

        findViewById<TextView>(R.id.tvUsername).text = "Username: $username"
        findViewById<TextView>(R.id.tvEmail).text = "Email: $email"
        findViewById<TextView>(R.id.tvPhone).text = "Nomor HP: $phone"
        findViewById<TextView>(R.id.tvGender).text = "Jenis Kelamin: $gender"
    }
}
