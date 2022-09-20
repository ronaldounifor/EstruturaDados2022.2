import estruturas.dinamica.LSE;
import estruturas.dinamica.No;

public class App {
    public static void main(String[] args) throws Exception {
        LSE lista = new LSE();

        lista.adicionarInicio(new No(9));
        lista.adicionarInicio(new No(7));
        lista.adicionarInicio(new No(5));
        lista.adicionarInicio(new No(3));
        lista.adicionarFinal(new No(14));
        lista.removerPosicao(2);
        lista.removerFinal();
        lista.removerInicio();

        lista.exibir();
    }

}