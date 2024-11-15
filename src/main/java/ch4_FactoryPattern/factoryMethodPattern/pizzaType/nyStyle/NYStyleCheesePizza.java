package ch4_FactoryPattern.factoryMethodPattern.pizzaType.nyStyle;

import ch4_FactoryPattern.factoryMethodPattern.pizzaType.PizzaInMethod;

public class NYStyleCheesePizza extends PizzaInMethod {
    public NYStyleCheesePizza(){
        name = "뉴욕 스타일 소스와 치즈 피자";
        dough = "씬 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("잘게 썬 레지아노 치즈");
    }
}