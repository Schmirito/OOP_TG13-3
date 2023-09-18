public class MeinThread extends Thread{
    
    //Objektvariablen
    String name;
    int wartezeit;
    String state;

    public MeinThread(String name, int wartezeit, String state){
        this.name = name;
        this.wartezeit = wartezeit;
        this.state = state;
    }

    //run Methode ueberschreiben
    @Override
    public void run(){
        
        if (state == "download") {
            for (int i = 0; i <= 699; i++) {

                System.out.println(name + "...");

                try {
                    Thread.sleep(wartezeit);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (state == "installed") {
               for (int i = 0; i <= 200; i++) {

                System.out.println();
                System.out.println(name + ":" + i);
                System.out.println();

                try {
                Thread.sleep(wartezeit);
            } catch (Exception e) {
                e.printStackTrace();
            }
                if (i == 200) {
                    System.out.println("All viruses successfully installed!");
                }
               } 
        }
            
        }
    

}
