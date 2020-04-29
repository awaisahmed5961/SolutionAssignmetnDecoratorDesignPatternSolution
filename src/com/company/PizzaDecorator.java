package com.company;

public abstract  class PizzaDecorator implements Pizza {
   protected Pizza target;
   protected  String description;
   protected  double price;

    public PizzaDecorator(Pizza target) {
        this.target = target;
    }
    @Override
    public abstract String getDesc();
}
