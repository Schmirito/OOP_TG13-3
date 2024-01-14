package KA_Vorbereitung150124;

import java.util.HashSet;

public class HashSetWiederhohlung {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            hash.add(i);
            hash.add(i);
        }
        System.out.println(hash);
    }
}
