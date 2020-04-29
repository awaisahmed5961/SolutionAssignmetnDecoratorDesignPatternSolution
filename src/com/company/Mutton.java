package com.company;

public class Mutton extends PizzaDecorator {
    public Mutton(Pizza target) {
        super(target);
    }

    @Override
    public double getPrice() {
        return 18.12 + target.getPrice();
    }

    @Override
    public String getDesc() {
        return (target.getDesc()+ ", Mutton (18.12)");
    }
}
