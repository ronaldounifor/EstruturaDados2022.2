


public class App {
    public static void main(String[] args) throws Exception {
        Recursao recursao = new Recursao();        
        System.out.println(recursao.fibonacci(6));
        System.out.println(recursao.fibonacci(7));
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