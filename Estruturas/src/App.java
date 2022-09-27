import estruturas.dinamica.LSECircular;
import estruturas.dinamica.No;

public class App {
    public static void main(String[] args) throws Exception {
        LSECircular lista = new LSECircular();
        
        lista.adicionarInicio(new No(1));
        lista.adicionarInicio(new No(2));
        lista.adicionarInicio(new No(3));
        lista.adicionarInicio(new No(4));
        lista.adicionarInicio(new No(5));
        lista.adicionarFinal(new No(12));
        lista.adicionarFinal(new No(22));

        lista.removerInicio();
        lista.removerInicio();
        lista.removerInicio();
        lista.removerFinal();

        lista.exibir();

        System.out.println(lista.retornarElemento(2).getProximo().getProximo().getElemento());

    }

}