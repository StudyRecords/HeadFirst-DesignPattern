package ch4_FactoryPattern.factoryMethodPattern.pizzaStore;

import ch4_FactoryPattern.factoryMethodPattern.pizzaType.PizzaInMethod;
import ch4_FactoryPattern.factoryMethodPattern.pizzaType.nyStyle.NYStyleCheesePizza;
import ch4_FactoryPattern.factoryMethodPattern.pizzaType.nyStyle.NYStyleClamPizza;
import ch4_FactoryPattern.factoryMethodPattern.pizzaType.nyStyle.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    public PizzaInMethod createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if(type.equals("veggie")){
            return new NYStyleVeggiePizza();
        } else if(type.equals("clam")){
            return new NYStyleClamPizza();
        }
//        else if(type.equals("pepperoni")){
//            return new NYStylePepperoniPizza();
//        }
        else {
            System.out.println("피자가 없습니다ㅠ");
            return null;
        }
    }

}
