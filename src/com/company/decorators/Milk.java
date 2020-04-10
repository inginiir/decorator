package com.company.decorators;

import com.company.decorated.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with milk";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
