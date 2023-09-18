package A2_ThreadsErzeugenMitInterface;
public class MeinThread2 implements Runnable{

    public static final String MeinThread2 = null;
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

        for (int i = 0; i < 100; i++) {
            System.out.println(name);
        }

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
