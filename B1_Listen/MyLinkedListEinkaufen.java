package B1_Listen;

import java.util.LinkedList;
import java.util.Scanner;

public class MyLinkedListEinkaufen{
    public static void main(String[] args) {
        System.out.flush();
        String eingabe;

        boolean weiter = true;

        LinkedList<String> einkaufsliste = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while(weiter == true){
        System.out.print("Neue Werte hinzufügen? ");
        eingabe = sc.nextLine();

        if (eingabe.equals("Ja") || eingabe.equals("ja")) {
            hinzufügen(einkaufsliste, sc, eingabe);    
        }
        if (eingabe.equals("Nein") || eingabe.equals("nein")) {
            System.out.println("--------------------");
            ausgabe(einkaufsliste);
            System.out.println("--------------------");
            entfernen(einkaufsliste, sc, eingabe);
        }
        System.out.println("\n--------------------\n");
    }
    }

    public static void hinzufügen(LinkedList<String> einkaufsliste, Scanner sc, String eingabe){
        System.out.print("Name des gewünchten Wertes: ");
        eingabe = sc.nextLine();
        einkaufsliste.add(eingabe);
    }
    public static void ausgabe(LinkedList<String> einkaufsliste){
        System.out.println("Momentane Werte: "+einkaufsliste);
    }
    public static void entfernen(LinkedList<String> einkaufsliste, Scanner sc, String eingabe){
        boolean weiter2 = true;

        while(weiter2 == true){
        System.out.print("Wert entfernen? ");
        eingabe = sc.nextLine();

        if (eingabe.equals("Ja") || eingabe.equals("ja")) {
            System.out.print("Name des zu entfernenden Wertes: ");
            eingabe = sc.nextLine();

            einkaufsliste.remove(eingabe);
            System.out.println("--------------------");
            ausgabe(einkaufsliste);
            System.out.println("--------------------");
        }
        if (eingabe.equals("Nein") || eingabe.equals("nein")) {
            weiter2 = false;
        }
    }
}
}