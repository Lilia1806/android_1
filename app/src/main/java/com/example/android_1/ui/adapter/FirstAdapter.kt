package com.example.android_1.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android_1.databinding.ItemBinding
import com.example.android_1.item.OnItemTextListener
import com.example.android_1.model.Model

class FirstAdapter(
    private val listCat: MutableList<Model>,
    private val onItemTextListener: OnItemTextListener
) : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    inner class FirstViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(model: Model) {
            binding.txt.text = model.name
            Glide.with(binding.image.context).load(model.cat).into(binding.image)
            itemView.setOnClickListener {
                onItemTextListener.onClick(model)
                binding.txt.text = model.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        return FirstViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.onBind(listCat[position])
    }

    override fun getItemCount(): Int = listCat.size
}
