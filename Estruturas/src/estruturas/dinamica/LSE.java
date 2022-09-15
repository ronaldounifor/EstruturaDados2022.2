package estruturas.dinamica;

import util.Validador;

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
    public int getQuantidade() {
        return this.quantidade;
    }

    //Verificar se a lista está vazia – estaVazia()
    public boolean estaVazia() {
        if(quantidade == 0)
            return true;
        else
            return false;
    }

    //Acessar o elemento na posição i – retornarElemento(i)


    //Checa se a posicao desejada é valida, ou seja, está dentro do vetor de elementos
    private boolean entradaValida(int posicao) {
        if(posicao >= 0 && posicao <= quantidade)
            return true;
        else
            return false;
    }

    //Inserir um elemento e na posição i – adicionarPosicao(e, i)
    public void adicionarPosicao(No noNovo, int posicao) {
        if(!entradaValida(posicao)) {
            System.out.println("Posição deve ser maior ou igual a zero e menor ou igual a quantidade.");
        } else {
            No noAntigo = primeiro;
            No noAnterior = null;
            for(int i = 0; i < posicao; i++) {
                noAnterior = noAntigo;
                noAntigo = noAntigo.getProximo();
            }
            
            noNovo.setProximo(noAntigo);

            //Se o nó na antiga posição (noAntigo) for nulo, então o novo nó (noNovo) está sendo adicionado na última posição.
            if(noAntigo == null)
                this.ultimo = noNovo;
            
            //Se o nó anterior (noAnterior) for nulo, então o novo nó (noNovo) está sendo adicionado na primeira posição. 
            if(noAnterior == null)
                this.primeiro = noNovo;
            else
                noAnterior.setProximo(noNovo);
                
            this.quantidade++;
        }
    }

    //Inserir um elemento e no início – adicionarInicio(e)
    //Inserir um elemento e no final – adicionarFinal(e)
    //Remover o elemento e na posição i – removerPosicao(i)
    //Remover o elemento no inicio – removerInicio()
    //Remover o elemento no final – removerFinal()

}
