package mc.Demo01;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't fly");
        System.out.println("mytest");
    }
}
