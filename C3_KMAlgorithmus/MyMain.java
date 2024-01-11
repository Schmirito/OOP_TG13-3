package C3_KMAlgorithmus;

import java.util.ArrayList;

public class MyMain {
    static int[] daten = {9,4,13,13,10,2,10,5,4,7,8,12,16,4,8,4,10,13,8,5};
    static ArrayList<MyCluster> cluster = new ArrayList<>();
    static boolean changed = true;
    public static void main(String[] args) {

        initCluster();

        while (changed) {
            clearCluster();

            for (int i = 0; i < cluster.size(); i++) {
                MyCluster mc = cluster.get(i);
                if (mc.mittelpunkt == berechneMittelpunkt(mc)) {
                    changed = false;
                }
                else{
                    mc.mittelpunkt = berechneMittelpunkt(mc);
                    changed = true;
                }
            }
            distanzCluster();
            ausgabe();
        }

    }

private static double berechneMittelpunkt(MyCluster mc){
    double mitte = 0;
    for (int i = 0; i < mc.datenPunkte.size(); i++) {
        mitte += mc.datenPunkte.get(i);
    }
    return mitte /= mc.datenPunkte.size();
}

private static void initCluster(){
    cluster.add(new MyCluster("A", 5));
    cluster.add(new MyCluster("B", 10));
    cluster.add(new MyCluster("C", 15));
}

private static void clearCluster(){
    for (int i = 0; i < cluster.size(); i++) {
        MyCluster c = cluster.get(i);
        c.datenPunkte.clear();
    }
}

private static void distanzCluster(){
    for (int i = 0; i < daten.length; i++) {
        int wiederhohlung = 0;
        double dist = 1000;
        for (int j = 0; j < cluster.size(); j++) {
            MyCluster c = cluster.get(j);
            if (Math.abs(c.mittelpunkt - daten[i]) <= dist) {
                dist = Math.abs(c.mittelpunkt - daten[i]);
                wiederhohlung++;
            }
        }
        cluster.get(wiederhohlung-1).datenPunkte.add(daten[i]);
    }
}

private static void ausgabe(){
    for (int i = 0; i < cluster.size(); i++) {
        System.out.println(cluster.get(i).datenPunkte);
    }
}
}
