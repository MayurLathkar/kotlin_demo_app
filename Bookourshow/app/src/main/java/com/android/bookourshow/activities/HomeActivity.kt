package com.android.bookourshow.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.bookourshow.R
import com.android.bookourshow.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.tvTitle.setText("Home Page")



    }
}


// TODO:
/*
*   1. Create Activity (xml will be auto created)
*   2. Bind xml to activity (private lateinit var binding: ActivityHomeBinding)
*   3. Initialize the declared binding of xml
*      (binding = ActivityHomeBinding.inflate(layoutInflater))
*      setContentView(binding.root)
*   4. Go to xml and create some ui and then provide the ids to the views
*
* */