package Ch4_FactoryPattern.factoryMethodPattern.pizzaStore;

import Ch4_FactoryPattern.factoryMethodPattern.pizzaType.PizzaInMethod;
import Ch4_FactoryPattern.factoryMethodPattern.pizzaType.nyStyle.NYStyleCheesePizza;
import Ch4_FactoryPattern.factoryMethodPattern.pizzaType.nyStyle.NYStyleClamPizza;
import Ch4_FactoryPattern.factoryMethodPattern.pizzaType.nyStyle.NYStylePepperoniPizza;
import Ch4_FactoryPattern.factoryMethodPattern.pizzaType.nyStyle.NYStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    public PizzaInMethod createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if(type.equals("veggie")){
            return new NYStyleVeggiePizza();
        } else if(type.equals("clam")){
            return new NYStyleClamPizza();
        } else if(type.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        } else return null;
    }

}
