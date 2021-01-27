package com.x5bart_soft.modernfoodrecipes

import com.x5bart_soft.modernfoodrecipes.models.FoodRecipe
import retrofit2.Response
import java.time.temporal.TemporalQueries
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val foodRecepesApi: FoodRecepesApi) {

    suspend fun getRecipes(queries: Map<String, String>): Response<FoodRecipe>{
        return  foodRecepesApi.getRecipes(queries)
    }

}
