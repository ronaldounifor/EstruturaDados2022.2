import estruturas.dinamica.PilhaEncadeada;
import estruturas.dinamica.No;

public class App {
    public static void main(String[] args) throws Exception {
        PilhaEncadeada pilha = new PilhaEncadeada();

        pilha.empilhar(new No(2));
        pilha.empilhar(new No(4));
        pilha.empilhar(new No(6));
        pilha.empilhar(new No(8));
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.desempilhar();
        pilha.empilhar(new No(2));
        pilha.empilhar(new No(4));
        pilha.empilhar(new No(6));
        pilha.empilhar(new No(8));
        pilha.desempilhar();
        pilha.desempilhar();

        System.out.println(pilha.retornarElemento().getElemento());

        pilha.exibir();

    }

}