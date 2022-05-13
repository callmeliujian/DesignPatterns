package Duck;

public class FlyWithWings implements FlyBehavior{
    /*飞行行为实现给会飞的鸭子使用*/
    @Override
    public void fly() {
        System.out.println("i am flying !");
    }
}
