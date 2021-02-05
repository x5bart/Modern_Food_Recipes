package com.x5bart_soft.modernfoodrecipes.bindigAdapters

import android.view.View
import android.view.View.*
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.x5bart_soft.modernfoodrecipes.date.datebase.RecipesEntity
import com.x5bart_soft.modernfoodrecipes.models.FoodRecipe
import com.x5bart_soft.modernfoodrecipes.util.NetworkResult

class RecipesBinding {
    companion object {

        @BindingAdapter("readApiResponse", "readDatabase", requireAll = true)
        @JvmStatic
        fun errorImageViewVisibility(
            imageView: ImageView,
            apiResponse: NetworkResult<FoodRecipe>?,
            database: List<RecipesEntity>?
        ) {
            when {
                apiResponse is NetworkResult.Error && database.isNullOrEmpty() -> {
                    imageView.visibility = VISIBLE
                }
                apiResponse is NetworkResult.Loading -> imageView.visibility = INVISIBLE
                apiResponse is NetworkResult.Succes -> imageView.visibility = INVISIBLE
            }
        }

        @BindingAdapter("readApiResponse2", "readDatabase2", requireAll = true)
        @JvmStatic
        fun errorTextViewVisibility(
            textView: TextView,
            apiResponse: NetworkResult<FoodRecipe>?,
            database: List<RecipesEntity>?
        ) {
            when {
                apiResponse is NetworkResult.Error && database.isNullOrEmpty() -> {
                    textView.visibility = VISIBLE
                    textView.text = apiResponse.message.toString()
                }
                apiResponse is NetworkResult.Loading -> textView.visibility = INVISIBLE
                apiResponse is NetworkResult.Succes -> textView.visibility = INVISIBLE
            }
        }

    }
}