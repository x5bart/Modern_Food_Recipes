package com.x5bart_soft.modernfoodrecipes.ui.fragments.foodjoke

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.x5bart_soft.modernfoodrecipes.databinding.FragmentFoodJokeBinding


class FoodJokeFragment : Fragment() {
    private lateinit var binding: FragmentFoodJokeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFoodJokeBinding.inflate(layoutInflater)
        return binding.root
    }

}