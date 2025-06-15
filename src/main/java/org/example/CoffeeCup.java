package org.example;

import org.example.coffeeIngredientsParams.*;


public class CoffeeCup {
    private CoffeeType drinkType;
    private CoffeeSizeMl drinkSize;
    private CoffeeGrind drinkGrind;
    private Double milkMl;
    private Double beansGr;

    public CoffeeType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(CoffeeType drinkType) {
        this.drinkType = drinkType;
    }

    public CoffeeSizeMl getDrinkSize() {
        return drinkSize;
    }

    public void setDrinkSize(CoffeeSizeMl drinkSize) {
        this.drinkSize = drinkSize;
    }

    public CoffeeGrind getDrinkGrind() {
        return drinkGrind;
    }

    public void setDrinkGrind(CoffeeGrind drinkGrind) {
        this.drinkGrind = drinkGrind;
    }

    public Double getMilkMl() {
        return milkMl;
    }

    public void setMilkMl(Double milkMl) {
        this.milkMl = milkMl;
    }

    public Double getBeansGr() {
        return beansGr;
    }

    public void setBeansGr(Double beansGr) {
        this.beansGr = beansGr;
    }

    @Override
    public String toString(){
        return "Coffee Cup {" +"\n"
                + "Drink Type: " + drinkType + "," + "\n"
                + "Drink Size: " + drinkSize + ","+ "\n"
                + "Drink Grind: " + drinkGrind + "," + "\n"
                + "Milk Ml: " + milkMl + "," + "\n"
                + "Beans Gr: " + beansGr + "}";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoffeeCup)) {
            return false;
        }
        CoffeeCup other = (CoffeeCup) obj;
        return drinkType.equals(other.drinkType)
                && drinkSize.equals(other.drinkSize)
                && drinkGrind.equals(other.drinkGrind)
                && milkMl.equals(other.milkMl)
                && beansGr.equals(other.beansGr);
    }

}
