package com.practice.project.mypracticeapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.practice.project.mypracticeapp.databinding.ItemNamesListBinding

class NamesRecyclerViewAdapter(var namesList : List<String>) : RecyclerView.Adapter<NamesRecyclerViewAdapter.NameViewHoler>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHoler {
        return NameViewHoler(
            ItemNamesListBinding.inflate(
                LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: NameViewHoler, position: Int) {
        holder.binding.tvName.setText(namesList.get(position).capitalize())
    }

    override fun getItemCount(): Int {
        return namesList.size
    }

    data class NameViewHoler(var binding: ItemNamesListBinding) : RecyclerView.ViewHolder(binding.root)
}