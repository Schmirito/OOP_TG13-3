package KA_Vorbereitung150124;

import java.util.ArrayList;

public class ArrayListWiederhohlung {
    public static void main(String[] args) {
        ArrayList<String> buchstaben = new ArrayList<>();
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        for (int i = 0; i < alphabet.length; i++) {
            buchstaben.add(alphabet[i]);
        }
        System.out.println(buchstaben);
        buchstaben.remove(10);
        System.out.println(buchstaben);
        buchstaben.add(10, "K");
        System.out.println(buchstaben);

        boolean con = buchstaben.contains("z");
        System.out.println(con);

        int size;
        size = buchstaben.size();
        System.out.println(size);
    }
}
