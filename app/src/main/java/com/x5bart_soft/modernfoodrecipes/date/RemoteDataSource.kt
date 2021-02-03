package com.x5bart_soft.modernfoodrecipes.date

import com.x5bart_soft.modernfoodrecipes.date.network.FoodRecipesApi
import com.x5bart_soft.modernfoodrecipes.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val foodRecepesApi: FoodRecipesApi) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe>{
        return  foodRecepesApi.getRecipes(queries)
    }

}
