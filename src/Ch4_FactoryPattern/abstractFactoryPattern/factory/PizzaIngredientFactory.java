package Ch4_FactoryPattern.abstractFactoryPattern.factory;

import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.cheese.Cheese;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.clam.Clam;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.dough.Dough;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.Sauce;

public interface PizzaIngredientFactory {
    public Cheese createCheese();
    public Clam createClam();
    public Dough createDough();
    public Sauce createSauce();
}
