package com.android.kotlindemoapp.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.android.kotlindemoapp.databinding.ActivitySplashBinding
import com.android.kotlindemoapp.fragments.SplashFragment

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

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
            val split=Intent(this,LoginActivity::class.java)
            startActivity(split)
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



