package Ch3_DecoraterPattern.starbucks.decorator;

import Ch3_DecoraterPattern.starbucks.beverage.Beverage;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public int cost() {
        if (size.equals(Size.TALL)) {
            return beverage.cost() + 200;
        }
        if (size.equals(Size.GRANDE)) {
            return beverage.cost() + 300;
        }
        return beverage.cost() + 400;       // VENTI
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }
}
