package com.android.kotlindemoapp.fragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.android.kotlindemoapp.activities.HomeActivity
import com.android.kotlindemoapp.activities.LoginActivity
import com.android.kotlindemoapp.databinding.FragmentLoginBinding

/**
 *  Created by mayurlathkar on 02/01/24
 */
class LoginFragment: Fragment() {

    private lateinit var fragmentLoginBinding: FragmentLoginBinding

    private val PREFERENCES_NAME = "MyPreferences"
    private var database: SharedPreferences? = null

    fun getInstance(context: Context): SharedPreferences? {
        if (database == null) {
            // getSharedPreferences is the function of AppCompatActivity class
            database = context.getSharedPreferences(PREFERENCES_NAME,
                AppCompatActivity.MODE_PRIVATE
            )
        }
        return database
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentLoginBinding = FragmentLoginBinding.inflate(inflater, container, false)
        return fragmentLoginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fragmentLoginBinding.btSign.setOnClickListener {

            val username = fragmentLoginBinding.etUsername.text.toString() // Pritam
            val password = fragmentLoginBinding.etPassword.text.toString() // 123456

            if (username == "Pritam" && password == "123456") {

                //Put user logged in state value in Local storage
                val database = getInstance(requireActivity())
                val editor = database?.edit()

                editor?.putBoolean("IS_USER_LOGGED_IN", true)
                editor?.apply()

                Toast.makeText(requireContext(), "Login success", Toast.LENGTH_SHORT).show()

                startActivity(Intent(requireActivity(), HomeActivity::class.java))
                requireActivity().finish()
            }
            else {
                Toast.makeText(requireContext(), "invalid user", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
