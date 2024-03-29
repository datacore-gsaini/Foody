package com.example.foody

import com.example.foody.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {
    @GET("recipes/complexSearch")
    suspend fun GetRecipes(
        @QueryMap queries : Map<String, String>
    ) : Response<FoodRecipe>
}