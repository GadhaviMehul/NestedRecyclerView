package com.example.myproject2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myproject2.databinding.ChildLayoutBinding

class ChildAdapter : RecyclerView.Adapter<ChildAdapter.ChildViewHolder>() {

    private var child = emptyList<ChildModel>()

    inner class ChildViewHolder(private val myItem: ChildLayoutBinding) :
        RecyclerView.ViewHolder(myItem.root) {
        fun bind(childModel: ChildModel) {
            myItem.person.text = childModel.name.toString()

            Glide.with(myItem.image.context).load(childModel.image).into(myItem.image)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChildViewHolder {
        val binding = ChildLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChildViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        val child = child[position]
        holder.bind(child)
    }

    override fun getItemCount(): Int = child.size
    fun setChildData(child: List<ChildModel>) {
        this.child = child
    }
}