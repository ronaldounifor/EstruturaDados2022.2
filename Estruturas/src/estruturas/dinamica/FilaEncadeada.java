package estruturas.dinamica;

import javax.swing.JOptionPane;

/**
 * Fila Encadeada
 */
public class FilaEncadeada {
    private No primeiro;
    private int quantidade;

    //Criar uma nova fila – Fila()
    public FilaEncadeada() {
        primeiro = null;
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

    //Acessar o elemento no início da fila – retornarElemento()
    public No retornarElemento() {
        return primeiro;
    }

    //Inserir um elemento e no final da fila – enfileirar(e)
    public void enfileirar(No novoNo) {
        if(estaVazia())
            primeiro = novoNo;
        else {
            No ultimoNo = primeiro;
            for(int i = 1; i < quantidade; i++)
                ultimoNo = ultimoNo.getProximo();
            
            ultimoNo.setProximo(novoNo);
        }
        quantidade++;
    }

    //Remover o elemento e no início da fila – desenfileirar()
    public No desenfileirar() {
        if(estaVazia()) {
            return null;
        } else {
            No removido = primeiro;

            primeiro = primeiro.getProximo();
            removido.setProximo(null);

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