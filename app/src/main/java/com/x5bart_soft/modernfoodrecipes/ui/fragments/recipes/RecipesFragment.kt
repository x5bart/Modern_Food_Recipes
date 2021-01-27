package com.x5bart_soft.modernfoodrecipes.ui.fragments.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.x5bart_soft.modernfoodrecipes.databinding.FragmentRecipesBinding


class RecipesFragment : Fragment() {

    private lateinit var binding: FragmentRecipesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        binding = FragmentRecipesBinding.inflate(layoutInflater)
        binding.recyclerView.showShimmer()
        return binding.root
    }




}