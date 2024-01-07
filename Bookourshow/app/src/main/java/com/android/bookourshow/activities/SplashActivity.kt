package com.android.bookourshow.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.android.bookourshow.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed(Runnable {
            startActivity(
                Intent(this, LoginActivity::class.java)
            )
        }, 3000)

    }
}


// TODO:
/*
*   1. Create Activity (xml will be auto created)
*   2. Bind xml to activity (private lateinit var binding: ActivityHomeBinding)
*   3. Initialize the declared binding of xml
*      (binding = ActivityHomeBinding.inflate(layoutInflater))
*      setContentView(binding.root)
*   4. If Activity is Splash Screen then user Handler for wait (for few seconds) on Splash screen
*      eg.
*      Handler(Looper.getMainLooper()).postDelayed(Runnable {
            startActivity(
                Intent(this, LoginActivity::class.java)
            )
        }, 3000)
        *
    5. Go to xml and create some ui and then provide the ids to the views
    6. Create Linear Layout inside it TextView, Button
    7. Access these views inside Activity using binding
       eg. val mb = binding.etMobilenumber.getText()
    8. Create local database by using SharedPreferences
    *  To save user already logged in state we are using database
    *  private val PREFERENCES_NAME = "myPreferences"
       private var database: SharedPreferences? = null
    * fun getInstance(): SharedPreferences? {
        if (database == null) {
            // getSharedPreferences is the function of AppCompatActivity class
            database = requireActivity().getSharedPreferences(PREFERENCES_NAME,
                AppCompatActivity.MODE_PRIVATE
            )
        }
        return database
    }
* */

