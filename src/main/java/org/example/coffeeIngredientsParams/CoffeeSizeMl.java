package org.example.coffeeIngredientsParams;

public enum CoffeeSizeMl {
    ML100(1) ,
    ML200(2),
    ML300(3),
    ML400(4);

    private final int coefficient;
    private CoffeeSizeMl(int coef){
        this.coefficient = coef;
    }
    public int coefficient(){return coefficient;}
}
