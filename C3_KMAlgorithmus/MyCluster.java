package C3_KMAlgorithmus;

import java.util.ArrayList;

public class MyCluster {
    public int pos;
    public ArrayList<Integer> datenPunkte= new ArrayList<>();
    public String name;
    public double mittelpunkt;

    public MyCluster(String name,int pos){
        this.pos = pos;
        this.name = name;
    }
}
