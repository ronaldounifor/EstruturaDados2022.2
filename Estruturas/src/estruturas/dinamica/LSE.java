package estruturas.dinamica;

import javax.swing.JOptionPane;

/**
 * Lista Simplesmente Encadeada (LSE)
 */
public class LSE {
    private No primeiro;
    private int quantidade;

    //Criar uma nova lista – Lista()
    public LSE() {
        primeiro = null;
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
    public No retornarElemento(int posicao) {
        if(!entradaValida(posicao))
            return null;
        else {
            No elementoAtual = primeiro;
            for(int i = 0; i < posicao; i++)
                elementoAtual = elementoAtual.getProximo();

            return elementoAtual;
        }
    }

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
            No noAntigo = retornarElemento(posicao);
            No noAnterior = retornarElemento(posicao - 1);
            
            noNovo.setProximo(noAntigo);
            
            //Se o nó anterior (noAnterior) for nulo, então o novo nó (noNovo) está sendo adicionado na primeira posição. 
            if(noAnterior == null)
                this.primeiro = noNovo;
            else
                noAnterior.setProximo(noNovo);
                
            this.quantidade++;
        }
    }

    //Inserir um elemento e no início – adicionarInicio(e)
    public void adicionarInicio(No noNovo) {
        adicionarPosicao(noNovo, 0);
    }

    //Inserir um elemento e no final – adicionarFinal(e)
    public void adicionarFinal(No noNovo) {
        adicionarPosicao(noNovo, quantidade);
    }

    //Remover o elemento e na posição i – removerPosicao(i)
    public No removerPosicao(int posicao) {
        //validar
        if(!entradaValida(posicao))
            return null;
        else {
            No noAnterior = retornarElemento(posicao - 1);
            No noRemovido = retornarElemento(posicao);

            if(noAnterior != null)
                noAnterior.setProximo(noRemovido.getProximo());
            else
                primeiro = noRemovido.getProximo();

            noRemovido.setProximo(null);
            quantidade--;

            return noRemovido;
        }
        
    }

    //Remover o elemento no inicio – removerInicio()
    public No removerInicio() {
        return removerPosicao(0);
    }

    //Remover o elemento no final – removerFinal()
    public No removerFinal() {
        return removerPosicao(quantidade - 1);
    }

    //Exibir todos os elementos
    public void exibir(){
        No atual = primeiro;
        String elementos = "";
        for (int i = 0; i < quantidade; i++) {
            elementos += atual.getElemento();

            atual = atual.getProximo();

            if(i != (quantidade - 1))
                elementos += ", ";
        }

        JOptionPane.showMessageDialog(null, elementos);
    }
}