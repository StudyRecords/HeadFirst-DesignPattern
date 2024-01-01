package Ch4_FactoryPattern.factoryMethodPattern.pizzaType.chicago;

import Ch4_FactoryPattern.factoryMethodPattern.pizzaType.PizzaInMethod;

public class ChicagoVeggiePizza extends PizzaInMethod {
    public ChicagoVeggiePizza(){
        name = "시카고 스타일 소스와 veggie 피자";
        dough = "씬 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("잘게 썬 레지아노 치즈");
    }

    @Override
    public void cut(){
        System.out.println("네모난 모양으로 피자 자르기");
    }
}
