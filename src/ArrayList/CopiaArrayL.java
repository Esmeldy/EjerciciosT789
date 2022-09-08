package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class CopiaArrayL {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Aida");
        nombres.add("Maia");
        nombres.add("Marta");
        nombres.add("Laura");

        System.out.println("ArrayList: ");
        for (String n : nombres){
            System.out.println(n);
        }

        LinkedList<String> nombresLinked = new LinkedList<>();
        nombresLinked.add(nombres.get(0));
        nombresLinked.add(nombres.get(1));
        nombresLinked.add(nombres.get(2));
        nombresLinked.add(nombres.get(3));

        System.out.println("\nLinkedList: ");
        for (String m : nombresLinked){
            System.out.println(m);
        }

    }
}
