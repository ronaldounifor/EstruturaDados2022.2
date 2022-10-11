import estruturas.dinamica.LSE;
import estruturas.dinamica.No;

public class App {
    public static void main(String[] args) throws Exception {
        LSE<String> lista = new LSE<>();
        lista.adicionarFinal(new No<>("Harry Potter"));
        lista.adicionarInicio(new No<>("Senhor dos aneis"));
        lista.adicionarPosicao(new No<>("One piece"), 1);

        lista.exibir();

    }
}