package B5_HashSet;

import java.util.HashSet;

public class HashSetKlasse{

    public static void main(String[] args) {

        HashSet<String> autos = new HashSet<String>();

        autos.add("Volvo");
        autos.add("BMW");
        autos.add("Ford");
        autos.add("BMW");
        autos.add("Mazda");

        System.out.println(autos);

        if(autos.contains("Mazda"))
            System.out.println("Mazda ist enthalten");

        autos.remove("Mazda");
        System.out.println(autos);

        int size = autos.size();
        System.out.println(size);

        for (String i : autos) {
            if (i == "BMW") {
                System.out.println(i);
            }
        }

        autos.clear();

        System.out.println();
    }
}