package C2_KM;

import java.util.ArrayList;
import java.util.List;

public class MyKM {
    static List<MyCluster> myC = new ArrayList<>();
    static List<MyData> myD = new ArrayList<>();
    static List<MyData> zwischenspeicher1 = new ArrayList<>();
    static List<MyData> zwischenspeicher2 = new ArrayList<>();
    public static void main(String[] args) {
        initCluster();
        initData();
        boolean changed = true;
        int delta = 0;
        do{
            weiseZu(changed,delta);
        }while(changed);
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

    public static void weiseZu(boolean changed, int delta){
        for (MyData myData : myD) {
            MyCluster mc = null;
            for (MyCluster myCluster : myC) {
                if ((Math.abs(myData.x - myCluster.x) + Math.abs(myData.y - myCluster.y)) < myData.dist) {
                    myData.dist = (Math.abs(myData.x - myCluster.x) + Math.abs(myData.y - myCluster.y));
                    mc = myCluster;
                }
            }
            myData.mc = mc;
            
            switch (delta) {
                case 0:
                    zwischenspeicher1.add(myData);
                    break;
                case 1:
                    zwischenspeicher2.add(myData);
                    break;
            }
            
        }
        delta++;
        if (zwischenspeicher1 == zwischenspeicher2) {
            changed = false;
        }
        else if(delta >1){
            zwischenspeicher1.clear();
            zwischenspeicher2.clear();
            delta = 0;
        }
        
    }

    public static void gebeAus(){
        
    }
}
