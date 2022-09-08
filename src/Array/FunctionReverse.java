package Array;

public class FunctionReverse {
    public static void main(String[] args) {
        System.out.println(Reverse("Hola mundo"));
    }
    public static String Reverse(String cadena){
        StringBuilder txt = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {
            txt.append(cadena.charAt(cadena.length() - i - 1));
        }

        return txt.toString();
    }
}
