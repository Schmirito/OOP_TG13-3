public class ErzeugeThread {

    public static void main(String[] args) {

        System.out.println("Main-Thread start");

        MeinThread2 threadA = new MeinThread2("Downloading Viruses", 1000, "download");
        MeinThread2 threadB = new MeinThread2("Viruses Downloaded", 3500, "installed");

        threadA.start();
        threadB.start();

        System.out.println("Main-Thread stop");
    }
}