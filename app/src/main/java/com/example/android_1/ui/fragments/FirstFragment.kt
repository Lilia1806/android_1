package com.example.android_1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_1.ui.adapter.FirstAdapter
import com.example.android_1.databinding.FragmentFirstBinding
import com.example.android_1.item.OnItemTextListener
import com.example.android_1.model.Model
import com.example.android_1.repository.FirstRepository

class FirstFragment : Fragment(), OnItemTextListener {
    private lateinit var binding: FragmentFirstBinding
    private val textList = mutableListOf<Model>()
    private val adapter = FirstAdapter(textList, this)
    private val repo = FirstRepository()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
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
        binding.rvFr.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        textList.addAll(repo.getListOfText())
        binding.rvFr.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onClick(model: Model) = with(binding) {
        val transition: NavDirections =
            FirstFragmentDirections.actionFirstFragmentToDetailFragment(
                model.cat.toString(),
                model.name.toString()
            )
        findNavController().navigate(transition)
    }
}