package org.example.recipes;

import org.example.coffeeIngredientsParams.*;

import org.example.OrderDrinkParams;
import org.example.exceptions.InvalidOrderException;

import java.util.List;

public abstract class Recipe {
    CoffeeType coffeeType;
    List<CoffeeSizeMl> coffeeSizes;
    List<CoffeeGrind> coffeeGrinds;
    Double milkAmountPer100ml;
    Double beansGrPer100ml;

   public void ingredientsCheck(OrderDrinkParams orderDrinkParams) {
       if(!this.coffeeSizes.contains(orderDrinkParams.getSize()) && !this.coffeeGrinds.contains(orderDrinkParams.getGrind())){
           throw new InvalidOrderException("parameters do not match recipe");
       }
   }
   public CoffeeType getCoffeeType() {
       return this.coffeeType;
   }

    public List<CoffeeSizeMl> getCoffeeSizes() {
        return coffeeSizes;
    }

    public List<CoffeeGrind> getCoffeeGrinds() {
        return coffeeGrinds;
    }

    public Double getMilkAmountPer100ml() {
        return milkAmountPer100ml;
    }

    public Double getBeansGrPer100ml() {
        return beansGrPer100ml;
    }
}
