package C2_KM;

import java.util.ArrayList;
import java.util.List;

public class MyKM {
    static List<MyCluster> myC = new ArrayList<>();
    static List<MyData> myD = new ArrayList<>();

    public static void main(String[] args) {
        initCluster();
        initData();
        weiseZu();
        gebeAus();
    }

    public static void initData(){
        myD.add(new MyData(4, 1));
        myD.add(new MyData(6, 5));
        myD.add(new MyData(3, 9));
        myD.add(new MyData(2, 7));
        myD.add(new MyData(8, 4));
        myD.add(new MyData(7, 2));
        myD.add(new MyData(9, 8));
        myD.add(new MyData(5, 3));
        myD.add(new MyData(1, 6));
    }
    public static void initCluster(){
        myC.add(new MyCluster(4, 6, "a"));
        myC.add(new MyCluster(2, 8, "b"));
    }

    public static void weiseZu(){
        for (MyData myData : myD) {
            MyCluster mc = null;
            for (MyCluster myCluster : myC) {
                if (Math.abs(myData.x - myCluster.x) < myData.minX) {
                    myData.minX = Math.abs(myData.x - myCluster.x);
                    mc = myCluster;
                }
            }
            myData.mc = mc;
            
        } 
    }

    public static void gebeAus(){
        System.out.println("-------Cluster-------");
        System.out.println(myC.toString());
        System.out.println("---------------------");
        System.out.println("-------Daten---------\n"+myD.toString()+"\n");
        System.out.println(myD);
    }
}
