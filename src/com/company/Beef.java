package com.company;

public class Beef extends PizzaDecorator {
    public Beef(Pizza target) {
        super(target);
    }

    @Override
    public double getPrice() {
        return 14.25 + target.getPrice();
    }

    @Override
    public String getDesc() {
        return ( target.getDesc() + ", Beef (14.25)");
    }
}
