package estruturas.dinamica;

import javax.swing.JOptionPane;

/**
 * Lista Duplamente Encadeada (LDE)
 */
public class LDE {
    private NoDinamico primeiro;
    private int quantidade;

    //Criar uma nova lista – Lista()
    public LDE() {
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
    public NoDinamico retornarElemento(int posicao) {
        if(!entradaValida(posicao))
            return null;
        else {
            NoDinamico elementoAtual = primeiro;
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
    public void adicionarPosicao(NoDinamico noNovo, int posicao) {
        if(!entradaValida(posicao)) {
            System.out.println("Posição deve ser maior ou igual a zero e menor ou igual a quantidade.");
        } else {
            NoDinamico noAntigo = retornarElemento(posicao);
            NoDinamico noAnterior = retornarElemento(posicao - 1);
            
            noNovo.setProximo(noAntigo);
            noNovo.setAnterior(noAnterior);
            
            //Se o nó anterior (noAnterior) for nulo, então o novo nó (noNovo) está sendo adicionado na primeira posição. 
            if(noAnterior == null)
                this.primeiro = noNovo;
            else
                noAnterior.setProximo(noNovo);
                
            //Se existia um nó na posicao, então o novo nó deve ser anterior a ele
            if(noAntigo != null)
                    noAntigo.setAnterior(noNovo);
                
            this.quantidade++;
        }
    }

    //Inserir um elemento e no início – adicionarInicio(e)
    public void adicionarInicio(NoDinamico noNovo) {
        adicionarPosicao(noNovo, 0);
    }

    //Inserir um elemento e no final – adicionarFinal(e)
    public void adicionarFinal(NoDinamico noNovo) {
        adicionarPosicao(noNovo, quantidade);
    }

    //Remover o elemento e na posição i – removerPosicao(i)
    public NoDinamico removerPosicao(int posicao) {
        //validar
        if(!entradaValida(posicao))
            return null;
        else {
            NoDinamico noAnterior = retornarElemento(posicao - 1);
            NoDinamico noRemovido = retornarElemento(posicao);

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
    public NoDinamico removerInicio() {
        return removerPosicao(0);
    }

    //Remover o elemento no final – removerFinal()
    public NoDinamico removerFinal() {
        return removerPosicao(quantidade - 1);
    }

    //Exibir todos os elementos
    public void exibir(){
        NoDinamico atual = primeiro;
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