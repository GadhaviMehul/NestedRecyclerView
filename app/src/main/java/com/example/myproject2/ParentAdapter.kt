package com.example.myproject2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myproject2.databinding.ParentLayoutBinding

class ParentAdapter : RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {
    private lateinit var list: List<ChildModel>
    val adapter = ChildAdapter()

    private var parent = emptyList<ParentModel>()

    inner class ParentViewHolder(private val myItem: ParentLayoutBinding) :
        RecyclerView.ViewHolder(myItem.root) {

        fun bind(parentModel: ParentModel) {
            myItem.date.text = parentModel.date.toString()
            myItem.name.text = parentModel.name.toString()

            list = listOf(
                ChildModel(R.drawable.a1, "Selena"),
                ChildModel(R.drawable.a2, "Jennifer"),
                ChildModel(R.drawable.a3, "Selena"),
                ChildModel(R.drawable.a4, "Jennifer"),
                ChildModel(R.drawable.a5, "Selena"),
                ChildModel(R.drawable.a6, "Jennifer"),
                ChildModel(R.drawable.a7, "Selena"),
                ChildModel(R.drawable.a8, "Jennifer"),
                ChildModel(R.drawable.a9, "Selena"),
                ChildModel(R.drawable.a10, "Jennifer"),
                ChildModel(R.drawable.a11, "Selena"),
                ChildModel(R.drawable.a12, "Jennifer")
                )
            myItem.recyclerView.layoutManager =LinearLayoutManager(myItem.recyclerView.context,LinearLayoutManager.HORIZONTAL,false)
            myItem.recyclerView.adapter = adapter
            adapter.setChildData(list)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        val binding =
            ParentLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ParentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        val parent = parent[position]
        holder.bind(parent)
    }

    override fun getItemCount(): Int = parent.size

    fun setParentData(parent: List<ParentModel>) {
        this.parent = parent
        notifyDataSetChanged()
    }
}