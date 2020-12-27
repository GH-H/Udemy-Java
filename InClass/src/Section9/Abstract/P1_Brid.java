package Section9.Abstract;

public class P1_Brid extends P1_Animal implements P1_CanFly {
    public P1_Brid(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("eating,bitch");
    }

    @Override
    public void breathe() {
        System.out.println("alive,bitch!");
    }

    @Override
    public void fly() {
        System.out.println(getName()+"flying, bitch");
    }
}
