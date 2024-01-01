package Ch4_FactoryPattern.abstractFactoryPattern.pizzaType;

import Ch4_FactoryPattern.abstractFactoryPattern.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory factory;
    public CheesePizza(PizzaIngredientFactory factory){
        this.factory = factory;
    }

    @Override
    public void prepare(){
        System.out.println("준비 중 : " + name);
        cheese = factory.createCheese();
        dough = factory.createDough();
        sauce = factory.createSauce();
    }
}
