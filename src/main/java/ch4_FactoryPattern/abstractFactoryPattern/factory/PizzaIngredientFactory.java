package ch4_FactoryPattern.abstractFactoryPattern.factory;

import ch4_FactoryPattern.abstractFactoryPattern.ingredient.cheese.Cheese;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.clam.Clam;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.dough.Dough;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.Sauce;

public interface PizzaIngredientFactory {
    public Cheese createCheese();
    public Clam createClam();
    public Dough createDough();
    public Sauce createSauce();
}
