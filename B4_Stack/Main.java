package B4_Stack;

public class Main {
    static String wert;
    public static void main(String[] args) {
        Lifo lifo = new Lifo();
        lifo.hinzufügen("ELAIIEES");
        lifo.hinzufügen("DYYYLAN");
        lifo.hinzufügen("NIKLAS");

        lifo.ausgabe();
        wert = lifo.entnehmeLetzte();
        lifo.ausgabe();

        System.out.println(wert);

        lifo.entferneLetztenWert();
        lifo.ausgabe();
    }
}
