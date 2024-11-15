package ch3_DecoraterPattern.starbucks.decorator;

import ch3_DecoraterPattern.starbucks.beverage.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public int cost() {
        if (size.equals(Size.TALL)) {
            return beverage.cost() + 400;
        }
        if (size.equals(Size.GRANDE)) {
            return beverage.cost() + 500;
        }
        return beverage.cost() + 600;       // VENTI
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}
