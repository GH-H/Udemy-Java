package Section9.Abstract;

public abstract class P1_Animal {
    private String name;

    public P1_Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName(){
        return name;
    }

}
