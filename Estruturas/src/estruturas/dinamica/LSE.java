package estruturas.dinamica;

/**
 * Lista Simplesmente Encadeada (LSE)
 */
public class LSE {
    private No primeiro;
    private No ultimo;
    private int quantidade;

    //Criar uma nova lista – Lista()
    public LSE() {
        primeiro = null;
        ultimo = null;
        quantidade = 0;
    }

    //Retornar a quantidade de elementos – getQuantidade()
    //Verificar se a lista está vazia – estaVazia()
    //Acessar o elemento na posição i – retornarElemento(i)


    //Inserir um elemento e na posição i – adicionarPosicao(e, i)
    public void adicionarPosicao(No noNovo, int posicao) {
        //achar antigoNo
        No noAntigo = primeiro;
        No noAnterior;
        for(int i = 0; i < posicao; i++) {
            noAnterior = noAntigo;
            noAntigo = noAntigo.getProximo();
        }
        //novoNo apontar pro antigoNo
        noNovo.setProximo(noAntigo);
        //anterior apontar pro novoNo

        //aumentar a quantidade
    }

    //Inserir um elemento e no início – adicionarInicio(e)
    //Inserir um elemento e no final – adicionarFinal(e)
    //Remover o elemento e na posição i – removerPosicao(i)
    //Remover o elemento no inicio – removerInicio()
    //Remover o elemento no final – removerFinal()

}
