package org.example;

import org.example.utils.RecipeBookFactory;

import static org.example.coffeeIngredientsParams.CoffeeGrind.*;
import static org.example.coffeeIngredientsParams.CoffeeSizeMl.*;
import static org.example.coffeeIngredientsParams.CoffeeType.*;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(RecipeBookFactory.getRecipeBook());
        OrderDrinkParams newDrinkOrder = new OrderDrinkParams(CAPPUCCINO, ML300, FINE);
        CoffeeCup thisCoffeeCup = coffeeMachine.make(newDrinkOrder);
        System.out.println("RESULT CHECK:");
        System.out.println(thisCoffeeCup);
        System.out.println("------------------------");
        coffeeMachine.printState();
    }
}