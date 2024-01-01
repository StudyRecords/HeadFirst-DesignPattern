package Ch4_FactoryPattern.abstractFactoryPattern.pizzaType;

import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.cheese.Cheese;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.clam.Clam;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.dough.Dough;
import Ch4_FactoryPattern.abstractFactoryPattern.ingredient.sauce.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clam clam;


    public abstract void prepare();
    public void bake(){
        System.out.println("175도에서 25분 간 굽기");
    }
    public void cut(){
        System.out.println("피자를 사선으로 자르기");
    }
    public void box(){
        System.out.println("상자에 피자를 담기");
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
