package com.android.bookourshow.activities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.android.bookourshow.R
import com.android.bookourshow.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    private val PREFERENCES_NAME = "myPreferences"
    private var database: SharedPreferences? = null

    fun getInstance(): SharedPreferences? {

        if (database == null) {
            database = getSharedPreferences(PREFERENCES_NAME, MODE_PRIVATE)
        }

        return database
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.btVerify.setOnClickListener{

            val mb = binding.etMobilenumber.getText()
            val d1 = binding.etOne.getText()
            val d2 = binding.etTwo.getText()
            val d3 = binding.etThree.getText()
            val d4 = binding.etFour.getText()

            if (mb.toString()=="1234567890" && d1.toString()=="1" && d2.toString()=="2"
                && d3.toString()=="3" && d4.toString()=="4") {
                    startActivity(Intent(this,HomeActivity::class.java))
            }

        }
    }
}


