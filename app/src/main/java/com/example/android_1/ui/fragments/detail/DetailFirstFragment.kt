package com.example.android_1.ui.fragments.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.android_1.databinding.FragmentDetailBinding

class DetailFirstFragment : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    private val args by navArgs<DetailFirstFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        data()
    }

    private fun data() {
        binding.txtNameDetail.text = args.name
        val name = args.cat
        Glide
            .with(binding.imageDetail.context)
            .load(name)
            .into(binding.imageDetail)
    }
}