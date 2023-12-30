package Ch3_DecoraterPattern.starbucks.beverage;

public class Decaf extends Beverage{

    private int price = 1500;

    public Decaf(){
        description = "디카페인";
    }

    @Override
    public int cost() {
        return price;
    }
}
