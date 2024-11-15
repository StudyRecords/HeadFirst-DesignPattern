package ch4_FactoryPattern.abstractFactoryPattern.pizzaType;

import ch4_FactoryPattern.abstractFactoryPattern.factory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    PizzaIngredientFactory factory;

    public VeggiePizza(PizzaIngredientFactory factory){
        this.factory = factory;
    }
    @Override
    public void prepare() {
        System.out.println("준비 중 : " + name);
        cheese = factory.createCheese();
        dough = factory.createDough();
        sauce = factory.createSauce();
    }
}
