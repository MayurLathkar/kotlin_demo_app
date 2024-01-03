package com.android.kotlindemoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.android.kotlindemoapp.databinding.FragmentLoginBinding

/**
 *  Created by mayurlathkar on 02/01/24
 */
class LoginFragment: Fragment() {
    private lateinit var fragmentLoginBinding: FragmentLoginBinding
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

            if (username == "Pritam" && password == "123456"){
                Toast.makeText(requireContext(), "Login done", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(requireContext(), "invalid user", Toast.LENGTH_SHORT).show()
            }

        }


    }
}
