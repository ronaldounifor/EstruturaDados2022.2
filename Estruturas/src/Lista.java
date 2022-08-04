public class Lista {
    private int primeiroElemento;
    private int ultimoElemento;
    private int quantidade;

    private int[] elementos;

    //Criar uma nova lista – Lista()
    public Lista() {
        primeiroElemento = -1;
        ultimoElemento = -1;
        quantidade = 0;
        elementos = new int[5];
    }

    public Lista(int limite) {
        primeiroElemento = -1;
        ultimoElemento = -1;
        quantidade = 0;
        elementos = new int[limite];
    }

    //Retornar a quantidade de elementos – getQuantidade()
    public int getQuantidade() {
        return quantidade;
    }

    //Verificar se a lista está vazia – estaVazia()
    public boolean estaVazia() {
        if(quantidade == 0)
            return true;
        else
            return false;
    }

    //Verificar se a lista está cheia, caso possua um limite – estaCheia()
    public boolean estaCheia() {
        if(quantidade == elementos.length)
            return true;
        else
            return false;
    }

    //Acessar o elemento na posição i – retornarElemento(i)
    //Inserir um elemento e na posição i – adicionarPosicao(e, i)
    //Inserir um elemento e no início – adicionarInicio(e)
    //Inserir um elemento e no final – adicionarFinal(e)
    //Remover o elemento e na posição i – removerPosicao(i)
    //Remover o elemento no inicio – removerInicio(i)
    //Remover o elemento no final – removerFinal(i)

}
