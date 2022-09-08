package Array;

public class FuntionReverse {
    public static void main(String[] args) {
        System.out.println(Reverse("Hola mundo"));
    }
    public static String Reverse(String cadena){
        String txt = "";
        for (int i = 0; i < cadena.length(); i++) {
            txt += cadena.charAt(cadena.length() - i - 1);
        }

        return txt;
    }
}
