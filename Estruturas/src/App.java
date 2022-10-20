public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(doisElevadoIterativo(0));
    }

    public static double doisElevadoA(double n) {
        if(n == 0)
            return 1;

        return 2 * doisElevadoA(n - 1);
    }

    public static double doisElevadoIterativo(double n) {
        double valor = 1;
        while(n-- > 0)
            valor *= 2;
        return valor;
    }
}