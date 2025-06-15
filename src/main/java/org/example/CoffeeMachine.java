package org.example;

import org.example.exceptions.*;
import org.example.coffeeIngredientsParams.CoffeeType;
import org.example.recipes.Recipe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;


public class CoffeeMachine {
    private Logger logger = LoggerFactory.getLogger(CoffeeMachine.class);
    private HashMap<CoffeeType, Recipe> recipes;
    private   Double beansCapacityGr;
    private  Double waterCapacityMl;
     private  Double milkCapacityMl;
     private  Integer cupsCapacity;

    CoffeeMachine(HashMap<CoffeeType, Recipe>  recipes){
        this.recipes = recipes;
        this.beansCapacityGr = 1000.0;
        this.waterCapacityMl = 1000.0;
        this.milkCapacityMl = 500.0;
        this.cupsCapacity = 10;
    }

    public CoffeeCup make(OrderDrinkParams orderDrinkParams) {
        logger.info("New order received: {}", orderDrinkParams);
        try {
            Recipe recipe = recipes.get(orderDrinkParams.getCoffeeType());
            recipe.ingredientsCheck(orderDrinkParams);
                try {
                    ValidateState(recipe, orderDrinkParams);
                    return makeCoffeeDrink(recipe, orderDrinkParams);
                } catch (Exception e) {
                    throw new CoffeeMachineException("Not enough ingredients: " + e.getMessage());
                }

        } catch (Exception e) {
            throw new InvalidOrderException(e.getMessage());
        }
    }

    private void ValidateState(Recipe recipe, OrderDrinkParams orderDrinkParams) {
        int coef = orderDrinkParams.getSize().coefficient();
        if (cupsCapacity < 1) {
            throw new CoffeeMachineException("Please clean the machine");
        }
        if (beansCapacityGr - recipe.getBeansGrPer100ml() * coef< 0) {
            throw new CoffeeMachineException("Not enough beans");
        }
        if (waterCapacityMl - (100 * coef - recipe.getMilkAmountPer100ml() * coef) < 0) {
            throw new CoffeeMachineException("Not enough water");
        }
        if (milkCapacityMl - recipe.getMilkAmountPer100ml() * coef < 0) {
            throw new CoffeeMachineException("Not enough milk");
        }
    }

    // todo checkCoffeeMachineState
    public void printState() {
        System.out.println("Coffee machine state: ");
        System.out.println("Water: " + waterCapacityMl);
        System.out.println("Beans: " + beansCapacityGr);
        System.out.println("Milk: " + milkCapacityMl);
        System.out.println("Cups: " + cupsCapacity);
    }

    public void waterRefill () {
        this.waterCapacityMl = 1000.0;
    }
    public void beansRefill () {
        this.beansCapacityGr = 1000.0;
    }
    public void milkRefill () {
        this.milkCapacityMl = 500.0;
    }
    public void cleanMachine() {
        this.cupsCapacity = 10;
    }

    private CoffeeCup makeCoffeeDrink(Recipe recipe, OrderDrinkParams orderDrinkParams) {
        CoffeeCup curr = new CoffeeCup();
        curr.setDrinkType(orderDrinkParams.getCoffeeType());
        curr.setDrinkSize(orderDrinkParams.getSize());
        curr.setDrinkGrind(orderDrinkParams.getGrind());
        curr.setMilkMl(recipe.getMilkAmountPer100ml() * orderDrinkParams.getSize().coefficient());
        curr.setBeansGr(recipe.getBeansGrPer100ml() * orderDrinkParams.getSize().coefficient());
        cupsCapacity--;
        beansCapacityGr -= recipe.getBeansGrPer100ml() * orderDrinkParams.getSize().coefficient();
        waterCapacityMl -= 100 * orderDrinkParams.getSize().coefficient() - recipe.getMilkAmountPer100ml() * orderDrinkParams.getSize().coefficient();
        milkCapacityMl -= recipe.getMilkAmountPer100ml() * orderDrinkParams.getSize().coefficient();
        return curr;
    }
}
