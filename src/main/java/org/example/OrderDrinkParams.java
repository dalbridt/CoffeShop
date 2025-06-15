package org.example;

import org.example.coffeeIngredientsParams.CoffeeGrind;
import org.example.coffeeIngredientsParams.CoffeeSizeMl;
import org.example.coffeeIngredientsParams.CoffeeType;

public class OrderDrinkParams {
    CoffeeSizeMl size;
    CoffeeType coffeeType;
    CoffeeGrind grind;

    public OrderDrinkParams( CoffeeType type, CoffeeSizeMl size, CoffeeGrind grind) {
        this.size = size;
        this.coffeeType = type;
        this.grind = grind;
    }

    public CoffeeSizeMl getSize() {
        return size;
    }

    public void setSize(CoffeeSizeMl size) {
        this.size = size;
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public CoffeeGrind getGrind() {
        return grind;
    }

    public void setGrind(CoffeeGrind grind) {
        this.grind = grind;
    }

    @Override
    public String toString() {
        return "OrderDrinkParams{" +
                "size=" + size +
                ", coffeeType=" + coffeeType +
                ", grind=" + grind +
                '}';
    }
}
