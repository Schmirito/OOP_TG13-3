package B1_Listen;

public class MyArray{
public static void main(String[] args) {
    //Es wird ein Array mit 3 namen angelegt
    //Wert hinzufügen
    //Ausgabe
    //Dann Löscht man einen Wert
    //Prüfen ob Wert in Liste
    //Erneute Ausgabe
   
    String[] name = {"Niklas","Marc","Simon"};

    for (int i = 0; i < name.length; i++) {
        System.out.println("Name: "+name[i]);
    }

    name[1] = null;

    for (int i = 0; i < name.length; i++) {
        if (name[i] == "Marc") {
            System.out.println("Niklas ist im Array enthalten");
        }
    }

    for (int i = 0; i < name.length; i++) {
        System.out.println("Name: "+name[i]);
    }
}
}