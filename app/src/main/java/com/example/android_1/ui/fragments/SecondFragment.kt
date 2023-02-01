package com.example.android_1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_1.databinding.FragmentSecondBinding
import com.example.android_1.model.Model
import com.example.android_1.repository.SecondRepository
import com.example.android_1.ui.adapter.SecondAdapter

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private val textList = mutableListOf<Model>()
    private val adapter = SecondAdapter(textList)
    private val repo = SecondRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        duplication()
        initialize()
    }

    private fun duplication() {
        textList.clear()
    }

    private fun initialize() {
        binding.rvSc.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        textList.addAll(repo.getListOfText())
        binding.rvSc.adapter = adapter
    }
}