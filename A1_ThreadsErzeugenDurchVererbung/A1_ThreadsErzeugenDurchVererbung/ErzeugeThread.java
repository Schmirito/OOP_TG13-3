package A1_ThreadsErzeugenDurchVererbung;
public class ErzeugeThread {

    public static void main(String[] args) {

        System.out.println("Main-Thread start");

        MeinThread threadA = new MeinThread("Downloading Viruses", 1000, "download");
        MeinThread threadB = new MeinThread("Viruses Downloaded", 3500, "installed");

        threadA.start();
        threadB.start();

        System.out.println("Main-Thread stop");
    }
}