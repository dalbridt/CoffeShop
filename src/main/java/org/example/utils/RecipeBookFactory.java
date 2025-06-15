package org.example.utils;

import static org.example.coffeeIngredientsParams.CoffeeType.*;

import org.example.coffeeIngredientsParams.CoffeeType;
import org.example.recipes.*;
import org.example.recipes.Recipe;

import java.util.HashMap;


public class RecipeBookFactory {
    public static HashMap<CoffeeType, Recipe> getRecipeBook () {
        HashMap<CoffeeType, Recipe> recipeBook = new HashMap<>();
        CappuccinoRecipe cappuccino = new CappuccinoRecipe();
        EspressoRecipe espresso = new EspressoRecipe();
        GlaceRecipe glace = new GlaceRecipe();
        recipeBook.put(CAPPUCCINO, cappuccino);
        recipeBook.put(ESPRESSO, espresso);
        recipeBook.put(GLACE, glace);

        return recipeBook;
    }
}
