package Ch3_DecoraterPattern.starbucks.beverage;

public class HouseBlend extends Beverage {

    private int price = 800;

    public HouseBlend(){
        description = "하우스 블렌드 커피";
    }

    @Override
    public int cost() {
        return price;
    }
}
