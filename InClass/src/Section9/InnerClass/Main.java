package Section9.InnerClass;

public class Main {
    public static void main(String[] args) {
        Gearbox bmw = new Gearbox(6);
        Gearbox.Gear first = bmw.new Gear(1,12.3);
    }
}
