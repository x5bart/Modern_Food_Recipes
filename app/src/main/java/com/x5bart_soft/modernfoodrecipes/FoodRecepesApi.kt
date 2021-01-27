package com.x5bart_soft.modernfoodrecipes

import com.x5bart_soft.modernfoodrecipes.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap
import java.time.temporal.TemporalQueries

interface FoodRecepesApi {

    @GET("/recipes/complexSearch")
   suspend fun getRecipes(
        @QueryMap queries: Map<String, String>
    ): Response<FoodRecipe>

}