package KA_Vorbereitung150124;

import java.util.LinkedList;

public class LinkedListWiederhohlung {
    
    public static void main(String[] args) {
        LinkedList<Double> temp = new LinkedList<>();

        double t = 20.0;
        for (int i = 0; i < 20; i++) {
            temp.add(t);
            t+=0.1;
        }
        System.out.println(temp+"\n");
        
        boolean p = temp.contains(20.7);
        System.out.println(p);

        System.out.println(temp.get(9));
        
    }
}
