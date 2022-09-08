public class MainClass {
    public static void main(String[] args) {
        DividePorCero(20,0);
    }

    public static void DividePorCero(int num1, int num2) throws ArithmeticException {
        try {
            int result = num1 / num2;
            System.out.println("Demo de código.");
            System.out.println("Resultado = "+result);
        }
        catch (ArithmeticException e) {
            System.out.println("Esto no se puede hacer..."+e.getLocalizedMessage());
        }
    }
}
