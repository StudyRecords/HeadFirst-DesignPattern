package Ch4_FactoryPattern.factoryMethodPattern.pizzaType.nyStyle;

import Ch4_FactoryPattern.factoryMethodPattern.pizzaType.PizzaInMethod;

public class NYStylePepperoniPizza extends PizzaInMethod {
    public NYStylePepperoniPizza(){
        name = "뉴욕 스타일 소스와 페퍼로니 피자";
        dough = "씬 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("버섯");
        toppings.add("양파");
        toppings.add("고추");
        toppings.add("페퍼로니");
    }
}
