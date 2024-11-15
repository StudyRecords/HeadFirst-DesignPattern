package ch4_FactoryPattern.abstractFactoryPattern.factory;

import ch4_FactoryPattern.abstractFactoryPattern.ingredient.cheese.Cheese;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.cheese.ReggianoCheese;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.clam.Clam;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.clam.FreshClams;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.dough.Dough;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.dough.ThickCrustDough;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.MarinaraSauce;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.Sauce;

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
