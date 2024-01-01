package Ch4_FactoryPattern.abstractFactoryPattern.factory;

import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.cheese.Cheese;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.cheese.MozzarellaCheese;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.clam.Clam;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.clam.FrozenClams;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.dough.Dough;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.dough.ThinCrustDough;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.MarinaraSauce;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.PlumTomatoSauce;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.Sauce;

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
