package InOutStream;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * La idea sería la siguiente:
 * Se trata de crear un programa que pregunte cuantos nombres se quieren introducir,
 * se introduzcan esos nombres en un archivo. Desde el archivo se pasan a un arrayList
 * para su impresión en pantalla
 */
public class NamesColection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputStream in;
        BufferedInputStream reader;
        ArrayList<Character> names = new ArrayList<>();
        System.out.println("¿Cuántos nombres quieres introducir? ");


        //Comprobar el número de nombres que se quieren introducir
        String archivo = "nombres.txt";
        try (PrintStream file = new PrintStream(archivo)) {
            int num = scanner.nextInt();
            while (0 < num) {
                //Introducir los nombres
                System.out.println("Introduce un nombre: ");
                file.print(scanner.next()+System.lineSeparator());
                num--;
            }

            //Lectura del fichero
            in = Files.newInputStream(Paths.get(archivo));
            reader = new BufferedInputStream(in);

            //lectura del fichero1
            int dato = reader.read();
            int index = 0;
            while (dato != -1) {
                names.add(index, (char) dato); //Imprime el contenido en el fichero 2
                index++;
                dato = reader.read();
            }

            System.out.println("En el fichero se encuentran los siguientes nombres: ");
            for (char name : names) {
                System.out.print(name);
            }

        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
