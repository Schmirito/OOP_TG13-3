package A3_AmpelMitThreads;

public class Ampel implements Runnable{

    int state;
    String name;
    int wartezeit;
    Thread t;
    

    public Ampel(String name, int state, int wartezeit){
        this.name = name;
        this.state = state;
        this.wartezeit = wartezeit;
        this.t = new Thread(this);
    }
    @Override
    public void run() {
        while (true) {
            switch (state) {
                case 0:
                    System.out.println("Ampel " + name + " Rot!" );
                    warte();
                    state = 1;
                    break;
            
                case 1:
                    System.out.println("Ampel " + name + " Rot-Gelb!" );
                    warte();
                    state = 2;
                    break;

                case 2:
                    System.out.println("Ampel " + name + " Grün!" );
                    warte();
                    state = 3;
                    break;
                
                case 3:
                    System.out.println("Ampel " + name + " Gelb!" );
                    warte();
                    state = 0;
                    break;
            }
        }
        
    }

    public void warte(){
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
