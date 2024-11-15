package ch3_DecoraterPattern.starbucks.beverage;

public class DarkRoast extends Beverage{

    private int price = 1000;

    public DarkRoast() {
        description = "다크 로스팅 커피";
    }

    @Override
    public int cost() {
        return price;
    }

}
