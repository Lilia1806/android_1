package com.example.android_1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_1.R
import com.example.android_1.databinding.FragmentFirstBinding
import com.example.android_1.databinding.FragmentSecondBinding
import com.example.android_1.databinding.FragmentThirtBinding
import com.example.android_1.item.OnItemTextListener
import com.example.android_1.repository.FirstRepository
import com.example.android_1.ui.adapter.FirstAdapter

class SecondFragment : Fragment(){
    private lateinit var binding : FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }
}