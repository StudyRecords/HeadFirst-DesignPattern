package ch1_Duck_StrategyPattern;

import ch1_Duck_StrategyPattern.fly.FlyNoWay;
import ch1_Duck_StrategyPattern.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
