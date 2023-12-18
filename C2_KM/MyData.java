package C2_KM;

public class MyData {
    MyCluster mc;
    public int x;
    public int y;
    public int minX = Integer.MAX_VALUE;

    public MyData(int x, int y){
        this.x = x;
        this.y = y;
        mc = null;
    }

    public void setCluster(MyCluster mc){
        this.mc = mc;
    }
    public MyCluster getCluster(){
        return mc;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int wert){
        this.x = wert;
    }
    public void setY(int wert){
        this.y = wert;
    }
}
