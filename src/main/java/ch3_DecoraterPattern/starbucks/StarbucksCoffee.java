package ch3_DecoraterPattern.starbucks;

import ch3_DecoraterPattern.starbucks.beverage.Beverage;
import ch3_DecoraterPattern.starbucks.beverage.DarkRoast;
import ch3_DecoraterPattern.starbucks.beverage.Espresso;
import ch3_DecoraterPattern.starbucks.beverage.HouseBlend;
import ch3_DecoraterPattern.starbucks.decorator.Mocha;
import ch3_DecoraterPattern.starbucks.decorator.SoyMilk;
import ch3_DecoraterPattern.starbucks.decorator.Whip;

public class StarbucksCoffee {
    public static void main(String[] args) {

        // case 1. 에스프레소 1잔
        Beverage espresso = new Espresso();
        espresso.setSize(Beverage.Size.GRANDE);
        System.out.println(espresso.getDescription() + " : " + espresso.cost() + "원");

        // case 2. 다크 로스팅 커피 한잔에 모카 2샷 추가, 휘핑크림 1번 추가
        Beverage darkRoast = new DarkRoast();
        darkRoast.setSize(Beverage.Size.VENTI);
        darkRoast = new Whip(new Mocha(new Mocha(darkRoast)));
        System.out.println(darkRoast.getDescription() + " : " + darkRoast.cost() + "원");

        // case 3. 하우스 블렌드 커피 한잔에 두유, 모카, 휘핑크림 1번씩 추가
        Beverage houseBlend = new HouseBlend();
        houseBlend.setSize(Beverage.Size.GRANDE);
        houseBlend = new SoyMilk(new Mocha(new Whip(houseBlend)));
        houseBlend.setSize(Beverage.Size.VENTI);       // 옵션을 추가한 후에는 사이즈 변경이 안 됨.
        System.out.println(houseBlend.getDescription() + " : " + houseBlend.cost() + "원");

    }
}
