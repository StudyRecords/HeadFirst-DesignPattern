package Ch4_FactoryPattern;

import Ch4_FactoryPattern.abstractFactoryPattern.pizzaType.Pizza;
import Ch4_FactoryPattern.factoryMethodPattern.pizzaStore.ChicagoPizzaStore;
import Ch4_FactoryPattern.factoryMethodPattern.pizzaStore.NYPizzaStore;
import Ch4_FactoryPattern.factoryMethodPattern.pizzaStore.PizzaStore;
import Ch4_FactoryPattern.factoryMethodPattern.pizzaType.PizzaInMethod;

public class PizzaTestDrive {
    public static void main(String[] args) {
        //팩토리 메서드 패턴 적용

        // case 1. 나는 뉴욕 스타일 피자를 먹고 싶어!!
        PizzaStore store1 = new NYPizzaStore();
        PizzaInMethod pizza1 = store1.orderPizza("cheese");
        System.out.println("에단이 주문한 " + pizza1.getName() + " 완성!!!\n");

        // case 2. 나는 시카고 스타일 피자가 먹고 싶어!!!
        PizzaStore store2 = new ChicagoPizzaStore();
        PizzaInMethod pizza2 = store2.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza2.getName() + " 완성!!!\n");

    }
}
