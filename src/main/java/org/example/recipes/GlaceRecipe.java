package org.example.recipes;

import org.example.coffeeIngredientsParams.CoffeeGrind;
import org.example.coffeeIngredientsParams.CoffeeSizeMl;

import java.util.List;

import static org.example.coffeeIngredientsParams.CoffeeType.GLACE;

public class GlaceRecipe extends Recipe {
    public GlaceRecipe() {
        this.coffeeType = GLACE;
        this.coffeeSizes = List.of(CoffeeSizeMl.ML300, CoffeeSizeMl.ML400);
        this.coffeeGrinds = List.of(CoffeeGrind.FINE);
        this.milkAmountPer100ml = 30.0;
        this.beansGrPer100ml = 10.0;
    }
}
