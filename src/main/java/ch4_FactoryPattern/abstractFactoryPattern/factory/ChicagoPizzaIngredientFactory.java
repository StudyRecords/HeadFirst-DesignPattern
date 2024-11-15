package ch4_FactoryPattern.abstractFactoryPattern.factory;

import ch4_FactoryPattern.abstractFactoryPattern.ingredient.cheese.Cheese;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.cheese.MozzarellaCheese;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.clam.Clam;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.clam.FrozenClams;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.dough.Dough;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.dough.ThinCrustDough;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.PlumTomatoSauce;
import ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
