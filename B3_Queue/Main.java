package B3_Queue;

public class Main{
    
    public static void main(String[] args) {
        
        Fifo fifo = new Fifo();
        fifo.push("a");
        fifo.push("c");
        fifo.push("Damerowwww");
        fifo.push("Dyyyyl");
        fifo.push("annnooo");
        fifo.push("JAAAAAAmes");
        
        while (fifo.first != null) {
            String ausgabe = fifo.pop();
            System.out.println(ausgabe);
        }
    }
}
