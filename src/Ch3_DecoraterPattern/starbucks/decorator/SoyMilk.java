package Ch3_DecoraterPattern.starbucks.decorator;

import Ch3_DecoraterPattern.starbucks.beverage.Beverage;

public class SoyMilk extends CondimentDecorator{

    public SoyMilk(Beverage beverage){
        this.beverage = beverage;
        this.size = beverage.getSize();
    }

    @Override
    public int cost() {
        if (size.equals(Size.TALL)) {
            return beverage.cost() + 300;
        }
        if (size.equals(Size.GRANDE)) {
            return beverage.cost() + 400;
        }
        return beverage.cost() + 500;       // VENTI
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
