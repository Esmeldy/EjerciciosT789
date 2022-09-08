package Vector;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        Vector<Integer> num = new Vector<>();

        //5 Elementos
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);

        //Eliminar el 2 y 3 elementos
        num.remove(1);
        num.remove(2);

        for (int i: num) {
            System.out.println(i);
        }

        System.out.println(num.capacity());


        /*
         *La capacidad por defecto del Vector es de 10, lo cual quiere decir
         * que cada vez que se sobrepase ese valor se creará un nuevo Vector
         * de la capacidad anterior + 10. Y así sucesivamente hasta llegar a mil.
         * Con esto tendríamos el último vector que ha ido de copia en copia...
         * unas 100 veces hasta completarlo. Esto generaría un gasto increíble en
         * memoria que se podría evitar cambiando la capacidad del vector
         * desde el principio.
         */

    }
}
