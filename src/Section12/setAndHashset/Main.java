package Section12.setAndHashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String,HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury",88);
//        solarSystem.put(temp.getName(),temp);
//        planets.add(temp);
        temp.addMoon(temp);

        for(HeavenlyBody planet: planets){
            System.out.println("\t"+ planet.getName());
        }

        System.out.println("////////////////////////////////////////////");

        HeavenlyBody body = solarSystem.get("Mercury");
        for(HeavenlyBody mercuryMoon: body.getSatellites()){
            System.out.println("\t" + mercuryMoon.getName());
        }
    }
}
