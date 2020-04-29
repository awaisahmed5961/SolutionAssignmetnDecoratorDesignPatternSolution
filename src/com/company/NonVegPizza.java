package com.company;

public class NonVegPizza implements Pizza {
    public NonVegPizza() {

    }

    @Override
    public String getDesc() {
        return ("NonVegPizza  ("+this.getPrice()+ ")" );
    }

    @Override
    public double getPrice() {
        return 350;
    }
}
