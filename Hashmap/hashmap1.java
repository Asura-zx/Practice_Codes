package Hashmap;
import java.util.*;

public class hashmap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> ageHash=new HashMap<String,Integer>();
        ageHash.put("Aayush", 20);
        ageHash.put("Abhi", 17);
        ageHash.put("Mehra",34);

        System.out.println(ageHash);

        ageHash.put("Aayush",21);
        System.out.println(ageHash);

        System.out.println(ageHash.get("Mehra"));



    }
    
}
