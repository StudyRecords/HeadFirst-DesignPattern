package Chapter1_Duck.fly;

import Chapter1_Duck.quack.QuackBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
