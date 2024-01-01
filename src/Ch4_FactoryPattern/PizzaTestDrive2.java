package Ch4_FactoryPattern;

import Ch4_FactoryPattern.abstractFactoryPattern.pizzaStore.ChicagoPizzaStore;
import Ch4_FactoryPattern.abstractFactoryPattern.pizzaStore.NYPizzaStore;
import Ch4_FactoryPattern.abstractFactoryPattern.pizzaStore.PizzaStore;
import Ch4_FactoryPattern.abstractFactoryPattern.pizzaType.Pizza;
public class PizzaTestDrive2 {
    public static void main(String[] args) {
        //추상 팩토리 패턴 적용

        // case 1. 나는 뉴욕 스타일 피자를 먹고 싶어!!
        PizzaStore store1 = new NYPizzaStore();
        Pizza pizza1 = store1.orderPizza("cheese");
        System.out.println("에단이 주문한 " + pizza1.getName() + " 완성!!!\n");

        // case 2. 나는 시카고 스타일 피자가 먹고 싶어!!!
        Ch4_FactoryPattern.abstractFactoryPattern.pizzaStore.PizzaStore store2 = new ChicagoPizzaStore();
        Pizza pizza2 = store2.orderPizza("cheese");
        System.out.println("조엘이 주문한 " + pizza2.getName() + " 완성!!!\n");

    }
}
