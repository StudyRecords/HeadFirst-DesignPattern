package Chapter1_Duck;

import Chapter1_Duck.fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        System.out.println();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlykBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
    }
}
