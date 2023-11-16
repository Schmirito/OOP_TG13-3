package B4_Stack;

import java.util.LinkedList;

public class Lifo extends LinkedList{

    LinkedList<String> liste = new LinkedList<String>();
    String wert;
    public void hinzufügen(String s){
        liste.add(s);
    }
    public String entnehmeLetzte(){
        wert = liste.pollLast();
        return wert;
    }
    public void entferneLetztenWert(){
        liste.removeLast();
    }
    public void ausgabe(){
        System.out.println(liste);
    }
}
