package Array;

public class ArrayMulti {
    public static void main(String[] args) {
        //Creación del array multidimensional
        int [][] array = new int[3][3];

        //Rellenar el array multidimensional
        array[0][0] = 1;
        array[0][1] = 10;
        array[0][2] = 20;
        array[1][0] = 30;
        array[1][1] = 40;
        array[1][2] = 50;
        array[2][0] = 60;
        array[2][1] = 70;
        array[2][2] = 80;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Posición: [ "+i+" ]"+"[ "+j+" ] = " +array[i][j]);
            }
        }
    }
}
