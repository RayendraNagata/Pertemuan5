package com.example.pertemuan5

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

// MainActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRegister = findViewById<Button>(R.id.btnRegister)
        btnRegister.setOnClickListener {
            val username = findViewById<EditText>(R.id.etUsername).text.toString()
            val email = findViewById<EditText>(R.id.etEmail).text.toString()
            val phone = findViewById<EditText>(R.id.etPhone).text.toString()
            val gender = findViewById<Spinner>(R.id.spGender).selectedItem.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USERNAME", username)
            intent.putExtra("EMAIL", email)
            intent.putExtra("PHONE", phone)
            intent.putExtra("GENDER", gender)
            startActivity(intent)
        }
    }
}
