package Section12.CollectionSection12;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        languages.put("java","1");
        languages.put("basic","basic instruction code");
        System.out.println(languages.put("python","a programming language"));
        System.out.println(languages.put("java","2"));

        if(languages.containsKey("java")){
            System.out.println("exist");
        }

        languages.remove("python","a programming language");

        for(String key: languages.keySet()){
            System.out.println(key + ":" + languages.get(key));
        }

        if(languages.replace("java","2","5")){
            System.out.println("replace successful");
        }
    }
}
