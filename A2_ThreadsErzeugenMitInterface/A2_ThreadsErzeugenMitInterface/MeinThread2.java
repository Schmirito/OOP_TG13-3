package A2_ThreadsErzeugenMitInterface;
public class MeinThread2 implements Runnable{

    String name;
    int wartezeit;
    Thread t;

    public MeinThread2(String name, int wartezeit){
        this.name = name;
        this.wartezeit = wartezeit;
        this.t = new Thread(this);
    }

    @Override
    public void run() {

        System.out.println(name);

        try {
            Thread.sleep(wartezeit);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
    public void start(){
        t.start();
    }
}
