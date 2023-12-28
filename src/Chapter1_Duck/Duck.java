package Chapter1_Duck;

import Chapter1_Duck.fly.FlyBehavior;
import Chapter1_Duck.quack.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {}

    public abstract void display();

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void setFlykBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
}
