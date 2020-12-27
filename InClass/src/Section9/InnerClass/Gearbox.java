package Section9.InnerClass;

import java.util.ArrayList;

public class Gearbox {
    private  ArrayList<Gear> gears;
    private int maxGears;
    private int currentGearNumber = 0;

    public Gearbox(int maxGears){
        this.maxGears = maxGears;
        gears = new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        gears.add(neutral);
    }

    public class Gear{
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber,double ratio){
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs*ratio;
        }
    }
}
