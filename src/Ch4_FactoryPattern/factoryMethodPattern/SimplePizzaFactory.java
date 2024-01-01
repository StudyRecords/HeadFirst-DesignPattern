package Ch4_FactoryPattern.factoryMethodPattern;

import Ch4_FactoryPattern.factoryMethodPattern.pizzaType.*;

public class SimplePizzaFactory {
    public PizzaInMethod createPizza(String type){
        PizzaInMethod pizza = null;

        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }
        else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza();
        }
        else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}