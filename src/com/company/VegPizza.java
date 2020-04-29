package com.company;

public class VegPizza implements Pizza {
    public VegPizza() {

    }

    @Override
    public String getDesc() {
        return ("VegPizza (" +this.getPrice()+ ")" );
    }

    @Override
    public double getPrice() {
        return 230;
    }
}
