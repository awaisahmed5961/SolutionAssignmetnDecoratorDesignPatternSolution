package com.company;

public class GreenOlives extends PizzaDecorator {
    double price = 5.47;
    public GreenOlives(Pizza target) {
        super(target);
    }

    @Override
    public double getPrice() {

        return 5.47 + target.getPrice();
    }

    @Override
    public String getDesc() {
        return (target.getDesc() +", GreenOlive  ("+this.price+")" );
    }
}
