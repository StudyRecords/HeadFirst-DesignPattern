package Ch4_FactoryPattern.factoryMethodPattern.pizzaType.nyStyle;

import Ch4_FactoryPattern.factoryMethodPattern.pizzaType.PizzaInMethod;

public class NYStyleClamPizza extends PizzaInMethod {
    public NYStyleClamPizza(){
        name = "뉴욕 스타일 소스와 조개 피자";
        dough = "씬 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("신선한 조개");
    }
}
