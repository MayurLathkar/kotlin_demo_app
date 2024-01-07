package com.android.kotlindemoapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.kotlindemoapp.databinding.FragmentSplashBinding

/**
 *  Created by mayurlathkar on 02/01/24
 */
class SplashFragment : Fragment() {

    private lateinit var fragmentSplashBinding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentSplashBinding = FragmentSplashBinding.inflate(inflater, container, false)
        return fragmentSplashBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Start accessing the view based on requirement
    }

}