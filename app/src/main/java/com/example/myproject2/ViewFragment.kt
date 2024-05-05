package com.example.myproject2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myproject2.databinding.FragmentViewBinding

class ViewFragment : Fragment() {
    private lateinit var binding: FragmentViewBinding
    val adapter = ParentAdapter()
    private lateinit var list: List<ParentModel>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewBinding.inflate(inflater, container, false)
        list = listOf(
            ParentModel("California roll", "13-07-2015 12:32 AM"),
            ParentModel("Macaroni and cheese", "15-07-2015 10:25 AM"),
            ParentModel("California roll", "13-07-2015 12:32 AM"),
            ParentModel("Macaroni and cheese", "15-07-2015 10:25 AM"),
            ParentModel("California roll", "13-07-2015 12:32 AM"),
            ParentModel("Macaroni and cheese", "15-07-2015 10:25 AM"),
            ParentModel("California roll", "13-07-2015 12:32 AM"),
            ParentModel("Macaroni and cheese", "15-07-2015 10:25 AM"),
            ParentModel("California roll", "13-07-2015 12:32 AM"),
            ParentModel("Macaroni and cheese", "15-07-2015 10:25 AM")
        )
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter
        adapter.setParentData(list)
        return binding.root
    }

}