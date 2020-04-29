package com.company;

public class RedOnions extends  PizzaDecorator {
    public RedOnions(Pizza target) {
        super(target);
    }

    @Override
    public double getPrice() {
        return 10.0 + target.getPrice();
    }

    @Override
    public String getDesc() {
        return (target.getDesc()+", RedOnion (10.0)");
    }
}
