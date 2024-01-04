package com.android.kotlindemoapp.activities

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.android.kotlindemoapp.databinding.ActivitySplashBinding
import com.android.kotlindemoapp.fragments.SplashFragment

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    private val PREFERENCES_NAME = "MyPreferences"
    private var sharedPreferences: SharedPreferences? = null

    fun getInstance(context: Context): SharedPreferences? {
        if (sharedPreferences == null) {
            // getSharedPreferences is the function of AppCompatActivity class
            sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME,
                MODE_PRIVATE
            )
        }
        return sharedPreferences
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addSplashFragment()
    }

    private fun addSplashFragment() {
        // Create splash fragment object here
        val splashFragment = SplashFragment()

        // Get FragmentManager object from Parent Activity
        val fragmentManager = supportFragmentManager

        // To add or replace fragment use the transaction
        val transaction = fragmentManager.beginTransaction()

        transaction.replace(
            binding.rootContainer.id,
            splashFragment,
            SplashFragment::class.java.name
        ).commitNow()

        Handler(Looper.getMainLooper()).postDelayed(Runnable {

            val isUserLoggedIn = getInstance(this)?.getBoolean("IS_USER_LOGGED_IN", false)

            if (isUserLoggedIn == true) {

                startActivity(Intent(this, HomeActivity::class.java))

            } else {

                startActivity(Intent(this, LoginActivity::class.java))

            }

            finish()
        }, 3000)
    }
}


/*            Splash Activity
*                    |
*              Splash Fragment // 3 sec // Use frame layout for adding or removing the fragment
*                    |
*  (Login Fragment || Register Fragment || Home page Activity)
*
*
* */



