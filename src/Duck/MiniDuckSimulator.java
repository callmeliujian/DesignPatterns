package Duck;

public class MiniDuckSimulator {

    public  static  void  main (String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        // 策略模式
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }

}
