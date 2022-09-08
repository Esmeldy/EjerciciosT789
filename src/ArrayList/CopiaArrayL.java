package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class CopiaArrayL {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();

        nombres.add("Aida");
        nombres.add("Maia");
        nombres.add("Marta");
        nombres.add("Laura");

        LinkedList<String> nombresLinked = new LinkedList<String>();
        //recorrer y copiar en LinkedList
        for (String n : nombres) {
            nombresLinked.add(n);
            System.out.println(n); //imprime ArrayList
        }
        System.out.println("\nLinkedList: ");
        for (String m : nombresLinked){
            System.out.println(m);
        }

    }
}
