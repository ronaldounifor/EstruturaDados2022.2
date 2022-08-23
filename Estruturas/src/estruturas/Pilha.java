package estruturas;

import javax.swing.JOptionPane;

public class Pilha {
    private int[] elementos;
    private int quantidade;

    //Criar uma nova pilha – Pilha()
    public Pilha() {
        elementos = new int[5];
        quantidade = 0;
    }

    public Pilha(int limite) {
        elementos = new int[limite];
        quantidade = 0;
    }

    //Retornar a quantidade de elementos – getQuantidade()
    public int getQuantidade() {
        return quantidade;
    }
    
    //Verificar se a pilha está vazia – estaVazia()
    public boolean estaVazia() {
        if(quantidade == 0)
            return true;
        else
            return false;
    }

    //Verificar se a pilha está cheia, caso exista um limite – estaCheia()
    public boolean estaCheia() {
        if(quantidade == elementos.length)
            return true;
        else
            return false;
    }

    //Inserir um elemento e no topo da pilha – empilhar(e)
    public void empilhar(int elemento) {
        if(estaCheia())
            System.out.println("A pilha está cheia, não é possível empilhar!");
        else {
            elementos[quantidade] = elemento;
            quantidade++;
        }
    }

    //Remover o elemento e no topo da pilha – desempilhar()
    public int desempilhar() {
        if(estaVazia())
            return -1;
        else {
            int removido = elementos[quantidade - 1];
            quantidade--;

            return removido;
        }        
    }

    //Acessar o elemento no topo da pilha – retornarElemento()
    public int retornarElemento() {
        if(estaVazia())
            return -1;
        else
            return elementos[quantidade - 1];
    }

    //Exibir todos os elementos
    public void exibir(){
        String elementos = this.elementos[0] + ", ";
        for (int i = 1; i < quantidade; i++) {
            elementos += this.elementos[i];

            if(i != (quantidade - 1))
                elementos += ", ";
        }

        JOptionPane.showMessageDialog(null, elementos);
    }
}
