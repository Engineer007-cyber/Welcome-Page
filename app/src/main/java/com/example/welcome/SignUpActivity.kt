package com.example.welcome

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity()  {
    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_activity)

        val  backward = findViewById<ImageView>(R.id.back)
        val name = findViewById<EditText>(R.id.editTextText)
        val email= findViewById<EditText>( R.id.editTextTextEmailAddress)
        val password = findViewById<EditText>(R.id.editTextTextPassword)
        val button8 = findViewById<Button>(R.id.button8)
        val textView = findViewById<TextView>( R.id.textView)
        textView.text=""

        button8.setOnClickListener {
            if (name.text.toString().isEmpty() || name.text.toString() == "Enter UserName") {
                textView.text = "Please enter a username"
            } else if (email.text.toString().isEmpty() || email.text.toString() == "Enter your Email") {
                textView.text = "Please enter an email"
            } else if (password.text.toString().isEmpty()) {
                textView.text = "Please enter a password"
            }
            else{
                textView.text = "SignUp Successful"
                val intent = Intent(this, LandingPage::class.java)
                startActivity(intent)
//                setContentView(R.layout.login_activity)
            }
        }

        backward.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            setContentView(R.layout.activity_main)
        }
    }
}