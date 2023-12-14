package C1_KNN;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    static int a,b;
    static int k = 3;
    static double distanz;
    static Optional<Double> min;
    static String antw;

    static double[] mins = new double[k];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<ObjektKlasse> obj = new ArrayList<>();
        ArrayList<Double> dst = new ArrayList<>();

        obj.add(new ObjektKlasse(72,20,0));
        obj.add(new ObjektKlasse(89,12,0));
        obj.add(new ObjektKlasse(94,6,0));
        obj.add(new ObjektKlasse(96,3,0));
        obj.add(new ObjektKlasse(97,2,0));

        obj.add(new ObjektKlasse(77,7,1));
        obj.add(new ObjektKlasse(84,10,1));
        obj.add(new ObjektKlasse(85,14,1));
        obj.add(new ObjektKlasse(87,9,1));
        obj.add(new ObjektKlasse(91,2,1));
        obj.add(new ObjektKlasse(92,10,1));
        obj.add(new ObjektKlasse(93,17,1));

        obj.add(new ObjektKlasse(75,25,2));
        obj.add(new ObjektKlasse(77,11,2));
        obj.add(new ObjektKlasse(80,17,2));
        obj.add(new ObjektKlasse(87,15,2));

        System.out.println("Neuen Wert hinzufügen?");
        antw = sc. next();
        if(antw == "Ja" || antw == "ja"){
        a = sc.nextInt();
        b = sc.nextInt();

        for (ObjektKlasse objektKlasse : obj) {
            distanz = berechneDistanz(a,b,objektKlasse.x, objektKlasse.y);
            dst.add(distanz);          
        }
        for (int i = 0; i < k; i++) {
            mins[k] = getMin(dst);
        }
        

        }
    }
    

public static double berechneDistanz(int a, int b, int x, int y){
    return Math.abs((a - x) + (b - y));

}
public static Optional getMin(ArrayList dst){
    return dst.stream().min(null);
}
}
