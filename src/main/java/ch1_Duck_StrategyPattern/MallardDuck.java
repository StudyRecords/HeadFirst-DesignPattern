package ch1_Duck_StrategyPattern;

import ch1_Duck_StrategyPattern.fly.FlyWithWings;
import ch1_Duck_StrategyPattern.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
