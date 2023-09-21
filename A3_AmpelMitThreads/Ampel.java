package A3_AmpelMitThreads;

public class Ampel implements Runnable{

    int state;
    String name;
    int wartezeit;

    public Ampel(String name, int state, int wartezeit){
        this.name = name;
        this.state = state;
        this.wartezeit = wartezeit;
    }
    @Override
    public void run() {
        while (true) {
            switch (state) {
                case 0:
                    
                    break;
            
                default:
                    break;
            }
        }
        
    }

    v
    
}
