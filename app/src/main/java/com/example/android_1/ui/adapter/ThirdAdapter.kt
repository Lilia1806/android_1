package com.example.android_1.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android_1.databinding.ItemBinding
import com.example.android_1.item.OnItemTextListener
import com.example.android_1.model.Model

class ThirdAdapter (
    private val listCat: MutableList<Model>)
    : RecyclerView.Adapter<ThirdAdapter.ThirdViewHolder>() {

    inner class ThirdViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: Model) {
            binding.txt.text = model.name
            Glide.with(binding.image.context).load(model.cat).into(binding.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThirdViewHolder {
        return ThirdViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ThirdViewHolder, position: Int) {
        holder.onBind(listCat[position])
    }

    override fun getItemCount(): Int = listCat.size
}