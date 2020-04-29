package com.company;

public class Chicken extends  PizzaDecorator {
    public Chicken(Pizza target) {
        super(target);
    }

    @Override
    public double getPrice() {
        return 20.20 + getPrice();
    }

    @Override
    public String getDesc() {
        return ( target.getDesc()+ ", Chicken (20.20)");
    }
}
