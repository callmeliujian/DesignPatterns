package Duck;

public class FlyNoWay implements FlyBehavior {
    /*飞行行为的实现，给不会飞的鸭子用*/
    @Override
    public void fly() {
        System.out.println("i can not fly");
    }
}
