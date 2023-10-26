package B1_Listen;

import java.util.LinkedList;

public class MyLinkedListNamen {

    public static void main(String[] args) {
    
    LinkedList<String> namen = new LinkedList<>();

    namen.add("Hanna");
    namen.add("Lisa");
    namen.add("Florian");

    System.out.println(namen);


    namen.removeLast();

    System.out.println("-----------\n"+namen);

    namen.addFirst("Helen");

    System.out.println("-----------\n"+namen);

    namen.addLast("Ann");

    System.out.println("-----------\n"+namen);

    namen.removeFirst();

    System.out.println("-----------\n"+namen);

    
    String testWert1 = namen.pop();
    System.out.println(testWert1);

    String testWert2 = namen.pollLast();
    System.out.println(testWert2);

    System.out.println(namen);
    }
    
}
