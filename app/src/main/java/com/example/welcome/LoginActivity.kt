package com.example.welcome

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val back = findViewById<ImageView>(R.id.back)
        val email = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val password = findViewById<EditText>(R.id.editTextTextPassword)
        val login = findViewById<Button>(R.id.login)
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = ""


        back.setOnClickListener {
            setContentView(R.layout.activity_main)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        login.setOnClickListener {
            if (email.text.toString().isEmpty() || email.text.toString() == "Email Account") {
                textView.text = "Please enter email"
            } else if (password.text.toString().isEmpty()) {
                textView.text = "Please enter password"
            } else {
                textView.text = "Login Successful"
                val intent = Intent(this, LandingPage::class.java)
                startActivity(intent)
            }
        }
    }
}