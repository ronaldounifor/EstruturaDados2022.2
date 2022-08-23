import estruturas.Pilha;

public class App {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();
        System.out.println("Elemento do topo: " + pilha.retornarElemento());
        System.out.println("Está cheia? " + pilha.estaCheia());
        System.out.println("Está vazia? " + pilha.estaVazia());

        pilha.empilhar(1);
        pilha.empilhar(2);

        System.out.println("Elemento do topo: " + pilha.retornarElemento());
        System.out.println("Está cheia? " + pilha.estaCheia());
        System.out.println("Está vazia? " + pilha.estaVazia());

        pilha.empilhar(3);
        pilha.empilhar(4);
        pilha.empilhar(5);
        
        System.out.println("Elemento do topo: " + pilha.retornarElemento());
        System.out.println("Está cheia? " + pilha.estaCheia());
        System.out.println("Está vazia? " + pilha.estaVazia());

        pilha.exibir();
    }
}
