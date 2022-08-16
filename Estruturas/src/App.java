import estruturas.Fila;

public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        
        System.out.println("O próximo é: "+fila.retornarElemento());
        System.out.println("A fila tem "+fila.getQuantidade() + " elementos.");

        fila.enfileirar(1);
        fila.enfileirar(3);
        fila.enfileirar(5);

        System.out.println("O próximo é: "+fila.retornarElemento());
        System.out.println("A fila tem "+fila.getQuantidade() + " elementos.");
    }
}
