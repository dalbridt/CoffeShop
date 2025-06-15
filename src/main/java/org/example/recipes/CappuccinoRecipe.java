package org.example.recipes;

import org.example.coffeeIngredientsParams.CoffeeGrind;
import org.example.coffeeIngredientsParams.CoffeeSizeMl;

import java.util.List;

import static org.example.coffeeIngredientsParams.CoffeeType.CAPPUCCINO;


public class CappuccinoRecipe extends Recipe{
    public  CappuccinoRecipe() {
        this.coffeeType = CAPPUCCINO;
        this.coffeeSizes = List.of(CoffeeSizeMl.ML200, CoffeeSizeMl.ML300, CoffeeSizeMl.ML400);
        this.coffeeGrinds = List.of(CoffeeGrind.FINE, CoffeeGrind.MEDIUM);
        this.milkAmountPer100ml = 10.0;
        this.beansGrPer100ml = 10.0;
    }

}
