package Section12.setAndHashset;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriodPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod){
        this.name = name;
        this.orbitalPeriodPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriodPeriod;
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return  true;
        }

        System.out.println("obj class is"+ obj.getClass());
        System.out.println("this class is "+ this.getClass());

        if((obj == null)||(obj.getClass() != this.getClass())){
            return false;
        }

        String objName = ((HeavenlyBody)obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
