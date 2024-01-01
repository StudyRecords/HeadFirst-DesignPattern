package Ch4_FactoryPattern.abstractFactoryPattern.factory;

import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.cheese.Cheese;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.cheese.ReggianoCheese;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.clam.Clam;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.clam.FreshClams;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.dough.Dough;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.dough.ThickCrustDough;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.MarinaraSauce;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.PlumTomatoSauce;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
