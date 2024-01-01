package Ch4_FactoryPattern.factoryMethodPattern.pizzaStore;

import Ch4_FactoryPattern.factoryMethodPattern.pizzaType.PizzaInMethod;

public abstract class PizzaStore {
//    SimplePizzaFactory factory;
//    public PizzaStore(SimplePizzaFactory factory){
//        this.factory = factory;
//    }

    public PizzaInMethod orderPizza(String type){
        PizzaInMethod pizza = createPizza(type);        //PizzaStore 클래스는 pizza에만 의존함. 구상 클래스가 뭔지 모름

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract PizzaInMethod createPizza(String type);
}
