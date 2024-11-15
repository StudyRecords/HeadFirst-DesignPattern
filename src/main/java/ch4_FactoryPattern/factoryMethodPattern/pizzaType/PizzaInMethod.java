package ch4_FactoryPattern.factoryMethodPattern.pizzaType;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaInMethod {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<String>();


    public void prepare(){
        System.out.println("준비 중 : " + name);
        System.out.println("도우를 돌리는 중...");
        System.out.println("소스를 뿌리는 중...");
        System.out.print("토핑을 올리는 중 : ");
        for (String topping:toppings) {
            System.out.print(" " + topping);
        }
        System.out.println();
    }
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
}
