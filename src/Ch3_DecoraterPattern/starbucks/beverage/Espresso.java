package Ch3_DecoraterPattern.starbucks.beverage;

public class Espresso extends Beverage {

    private int price = 2500;

    public Espresso(){
        description = "에스프레소";
    }

    @Override
    public int cost() {
        return price;
    }

}
