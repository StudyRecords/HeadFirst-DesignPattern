package Ch4_FactoryPattern.abstractFactoryPattern.pizzaStore;

import Ch4_FactoryPattern.abstractFactoryPattern.pizzaType.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
