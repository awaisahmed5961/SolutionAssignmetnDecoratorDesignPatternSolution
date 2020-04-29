package com.company;

public class RomaTomatoes extends PizzaDecorator {
    public RomaTomatoes(Pizza target) {
        super(target);
    }

    @Override
    public String getDesc() {

        return  (target.getDesc()+ ", RomaTomatoes (5.20)");
    }
    @Override
    public double getPrice() {
        return 5.20 +target.getPrice();
    }


}
