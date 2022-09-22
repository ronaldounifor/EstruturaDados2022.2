package estruturas.dinamica;

import javax.swing.JOptionPane;

/**
 * Pilha Encadeada
 */
public class PilhaEncadeada {
    private No primeiro;
    private No ultimo;
    private int quantidade;

    //Criar uma nova fila – Pilha()
    public PilhaEncadeada() {
        primeiro = null;
        ultimo = null;
        quantidade = 0;
    }
    
    //Retornar a quantidade de elementos – getQuantidade()
    public int getQuantidade() {
        return this.quantidade;
    }

    //Verificar se a fila está vazia – estaVazia()
    public boolean estaVazia() {
        if(quantidade == 0)
            return true;
        else
            return false;
    }

    //Acessar o elemento no topo da pilha – retornarElemento()
    public No retornarElemento() {
        return ultimo;
    }

    //Inserir um elemento e no topo da pilha – empilhar(e)
    public void empilhar(No novoNo) {
        if(estaVazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.setProximo(novoNo);
            ultimo = novoNo;
        }
        quantidade++;
    }

    //Remover o elemento e no topo da pilha – desempilhar()
    public No desempilhar() {
        if(estaVazia()) {
            return null;
        } else {
            No removido = ultimo;

            No noAnterior = null;
            for(int i = 1; i < quantidade; i++) {
                if(noAnterior == null)
                    noAnterior = primeiro;
                else
                    noAnterior = noAnterior.getProximo();
            }
            
            if(noAnterior == null) {
                primeiro = null;
                ultimo = null;
            } else {
                noAnterior.setProximo(null);
                ultimo = noAnterior;
            }

            quantidade--;
            return removido;
        }
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