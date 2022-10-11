import estruturas.dinamica.LDE;
import estruturas.dinamica.NoDinamico;

public class App {
    public static void main(String[] args) throws Exception {
        LDE lista = new LDE();
        System.out.println(lista.estaVazia());

        lista.adicionarInicio(new NoDinamico(1));
        lista.adicionarFinal(new NoDinamico(3));
        lista.adicionarPosicao(new NoDinamico(2), 1);

        lista.adicionarInicio(new NoDinamico(5));
        lista.adicionarInicio(new NoDinamico(5));
        lista.adicionarInicio(new NoDinamico(5));

        lista.removerFinal();
        lista.removerInicio();
        lista.removerPosicao(3);

        lista.exibir();
        System.out.println(lista.getQuantidade());
        System.out.println(lista.estaVazia());
    }

}