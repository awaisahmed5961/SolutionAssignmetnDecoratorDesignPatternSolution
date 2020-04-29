package com.company;

public class FetaCheese extends  PizzaDecorator{
    public FetaCheese(Pizza target) {
        super(target);
    }

    @Override
    public double getPrice() {
        return 21.0 + target.getPrice();
    }

    @Override
    public String getDesc() {
        return (target.getDesc()+ ", FetaCheese (21.0)");
    }
}
