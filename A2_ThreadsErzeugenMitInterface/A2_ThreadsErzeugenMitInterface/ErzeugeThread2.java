package A2_ThreadsErzeugenMitInterface;
public class ErzeugeThread2 {

    public static void main(String[] args) {
        
        System.out.println("Main Thread start");

        MeinThread2 threadA = new MeinThread2("a",1000);
        MeinThread2 threadB = new MeinThread2("b",500);

        threadA.start();
        threadB.start();

        System.out.println("Main Thread stopp");
    }
}
