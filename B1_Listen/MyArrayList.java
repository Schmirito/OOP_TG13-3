package B1_Listen;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> namen = new ArrayList<>();

        namen.add("Peter");
        namen.add("Silie");
        namen.add("Franz");

        System.out.println(namen);

        namen.remove(1);

        for (String strNr : namen) {
            if (strNr.equals("Franz")) {
                System.out.println("Franz ist enthalten");
            }
        }
        
         System.out.println(namen);
    }
}
