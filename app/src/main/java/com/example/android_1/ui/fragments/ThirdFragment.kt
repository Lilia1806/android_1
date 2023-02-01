package com.example.android_1.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android_1.databinding.FragmentThirtBinding

class ThirdFragment : Fragment() {
    private lateinit var binding : FragmentThirtBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirtBinding.inflate(inflater, container, false)
        return binding.root
    }
}