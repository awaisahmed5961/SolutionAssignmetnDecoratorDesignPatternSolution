package com.company;

public class Broccoli extends PizzaDecorator {
    public Broccoli(Pizza target) {
        super(target);
    }

    @Override
    public double getPrice() {
        return 20.2 + target.getPrice();
    }

    @Override
    public String getDesc() {
        return (target.getDesc() + ", Broccoli (20.2)");
    }
}
