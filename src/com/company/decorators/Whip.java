package com.company.decorators;

import com.company.decorated.Beverage;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() +  ", with Whip";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
