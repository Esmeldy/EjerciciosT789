package InOutStream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;



public class FileInFileOut {
    public static void main(String[] args) {
        CopiaAFichero("Soy Esmeldy","Adios Eme");
    }

    public static void CopiaAFichero(String fileIn, String fileOut) {
        String fichero1 = fileIn+".txt";
        String fichero2 = fileOut+".txt";
        try {
            //crea el fichero
            System.out.println("Creación del fichero correcta.");
            try (PrintStream file = new PrintStream(fichero1)) {
                //escribe en el fichero
                file.println("Nombre del fichero: "+fileIn);
                System.out.println("Escritura del fichero correcta.");
            }

            //Crea el segundo fichero y lee el contenido del primero
            try (PrintStream file = new PrintStream(fichero2)) { //Crea el segundo fichero
                InputStream in = Files.newInputStream(Paths.get(fichero1));
                BufferedInputStream reader = new BufferedInputStream(in);

                //lectura del fichero1
                int dato = reader.read();
                while (dato != -1) {
                    file.print((char)dato); //Imprime el contenido en el fichero 2
                    dato = reader.read();
                }
                System.out.println("Lectura del fichero correcta.");

            } catch (IOException e) {
                System.out.println("Error en la lectura del fichero.");
                throw new RuntimeException(e.getLocalizedMessage());
            }

        } catch (FileNotFoundException e){
            System.out.println("Error en la creación del fichero.");
            throw new RuntimeException(e.getLocalizedMessage());
        }


    }
}
