package com.company.decorators;

import com.company.decorated.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with Soy";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.GRANDE) {
            cost += 0.15;
        } else if (beverage.getSize() == Size.TALL) {
            cost += 0.1;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += 0.2;
        }
        return cost;
    }
}
