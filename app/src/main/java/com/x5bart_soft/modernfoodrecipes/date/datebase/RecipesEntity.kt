package com.x5bart_soft.modernfoodrecipes.date.datebase

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.x5bart_soft.modernfoodrecipes.models.FoodRecipe
import com.x5bart_soft.modernfoodrecipes.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity(
    var foodRecipe: FoodRecipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}