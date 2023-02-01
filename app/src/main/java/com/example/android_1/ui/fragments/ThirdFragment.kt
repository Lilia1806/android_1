package com.example.android_1.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_1.databinding.FragmentThirtBinding
import com.example.android_1.model.Model
import com.example.android_1.repository.ThirdRepository
import com.example.android_1.ui.adapter.ThirdAdapter

class ThirdFragment : Fragment() {
    private lateinit var binding : FragmentThirtBinding
    private val textList = mutableListOf<Model>()
    private val adapter = ThirdAdapter(textList)
    private val repo = ThirdRepository()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirtBinding.inflate(inflater, container, false)
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
        binding.rvTh.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        textList.addAll(repo.getListOfText())
        binding.rvTh.adapter = adapter
    }
}