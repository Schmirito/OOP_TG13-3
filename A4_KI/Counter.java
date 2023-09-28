package A4_KI;

import java.util.Scanner;

public class Counter implements Runnable{

    Thread t;
    static final int COUNT_LIMIT = 100;
    static volatile boolean shouldRun = true;
    public int counter = 0;
    
    @Override
    public void run() {
        
        while (shouldRun) {
            System.out.println("Current count: "+getCount());

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                shouldRun = false;
            }
        }
        
    }
    
    public String getCount(){
        return counter++;
    }

    public static void main(String[] args) {
        new Thread(() -> new Counter()).start();

        Scanner sc = new Scanner(System.in);
        while (sc.nextLine().toLowerCase().startsWith("q")) {
            shouldRun = false;
            sc.close();
            
        }
    }
}
