package com.company;

public class Spinach  extends  PizzaDecorator{
    public Spinach(Pizza target) {
        super(target);
    }

    @Override
    public double getPrice() {
        return 7.92 + target.getPrice();
    }

    @Override
    public String getDesc() {
        return (target.getDesc()+ ",  Spinach (7.92)");
    }
}
