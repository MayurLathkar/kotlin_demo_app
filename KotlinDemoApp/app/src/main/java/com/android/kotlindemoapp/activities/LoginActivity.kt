package com.android.kotlindemoapp.activities

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.kotlindemoapp.databinding.ActivityLoginBinding
import com.android.kotlindemoapp.fragments.LoginFragment


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addLoginFragment()
    }

    private fun addLoginFragment() {
        // Create splash fragment object here
        val loginFragment = LoginFragment()

        // Get FragmentManager object from Parent Activity
        val fragmentManager = supportFragmentManager

        // To add or replace fragment use the transaction
        val transaction = fragmentManager.beginTransaction()

        transaction.replace(
            binding.rootContainer.id,
            loginFragment,
            LoginFragment::class.java.name
        ).commitNow()

    }
}
