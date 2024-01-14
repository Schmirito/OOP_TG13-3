package KA_Vorbereitung150124;

public class ArraysWiederhohlung {
    
    public static void main(String[] args) {
        int[] zahlen = new int[20];
        int z = 1;
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = z;
            z++;
        }
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
        zahlen[10] = -1;
        
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
}
