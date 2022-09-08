package ArrayList;

import java.util.ArrayList;

public class BucleArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        //rellenarlo
        for(int i=1; i<=10; i++) {
            numbers.add(i);
        }

        //recorrer y eliminar los pares
        System.out.println("ArrayList final:  ");
        for (int i=0; i < numbers.size() -1; i++) {
            //Números pares
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
            System.out.println("-->  "+numbers.get(i));

        }
    }
}
