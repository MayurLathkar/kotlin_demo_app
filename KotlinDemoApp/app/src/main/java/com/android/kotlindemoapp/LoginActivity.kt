package com.android.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.kotlindemoapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), MySampleInterface {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // To link Ui to LoginActivity class
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setClickListener()
    }

    private fun setClickListener() {
        binding.btSignIn.setOnClickListener {
            // Will only execute when user clicks in Sign In
            val userName = binding.etUserName.text.toString()
            val password = binding.etPassword.text.toString()

            if (userName == "Pritam" && password == "123456") {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}