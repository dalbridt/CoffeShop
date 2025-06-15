package org.example.recipes;

import org.example.CoffeeCup;
import org.example.coffeeIngredientsParams.CoffeeGrind;
import org.example.coffeeIngredientsParams.CoffeeSizeMl;
import org.example.coffeeIngredientsParams.CoffeeType;

import java.util.List;

import static org.example.coffeeIngredientsParams.CoffeeType.ESPRESSO;

public class EspressoRecipe extends Recipe{
    public EspressoRecipe() {
        this.coffeeType = ESPRESSO;
        this.coffeeSizes = List.of(CoffeeSizeMl.ML100, CoffeeSizeMl.ML200);
        this.coffeeGrinds = List.of(CoffeeGrind.MEDIUM, CoffeeGrind.COARSE);
        this.milkAmountPer100ml = 0.0;
        this.beansGrPer100ml = 10.0;
    }
}
