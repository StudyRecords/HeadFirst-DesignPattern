package Ch3_DecoraterPattern.starbucks.decorator;

import Ch3_DecoraterPattern.starbucks.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;
    Size size;

    int price;

    @Override
    public abstract String getDescription();

//    @Override
//    public Size getSize(){
//        return beverage.getSize();
//    }

}
