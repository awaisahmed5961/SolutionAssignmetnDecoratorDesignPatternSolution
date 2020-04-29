package com.company;

public class Cheese extends PizzaDecorator {

    public Cheese(Pizza target) {
        super(target);
    }

    @Override
    public double getPrice() {

        return 20.72 + target.getPrice();
    }

    @Override
    public String getDesc() {
        return ( target.getDesc()+ ", Cheese (20.72)");
    }
}
