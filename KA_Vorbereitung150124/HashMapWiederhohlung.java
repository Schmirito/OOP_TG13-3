package KA_Vorbereitung150124;

import java.util.HashMap;

public class HashMapWiederhohlung {
    public static void main(String[] args) {
        HashMap<String,String> passwort = new HashMap<>();

        passwort.put("Hallo", "Hello");
        passwort.put("Straße", "Street");
        passwort.put("Haus", "House");
        passwort.put("Essen", "Food");
        passwort.put("Kind", "Child");
        passwort.put("Mutter", "Mother");
        passwort.put("Wasser", "Water");

        System.out.println(passwort.get("Straße"));

        System.out.println(passwort.toString());
    }
    
}
