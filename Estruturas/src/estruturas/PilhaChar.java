package estruturas;

import javax.swing.JOptionPane;

public class PilhaChar {
    private char[] elementos;
    private int quantidade;

    //Criar uma nova pilha – Pilha()
    public PilhaChar() {
        elementos = new char[5];
        quantidade = 0;
    }

    public PilhaChar(int limite) {
        elementos = new char[limite];
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
    public void empilhar(char elemento) {
        if(estaCheia())
            System.out.println("A pilha está cheia, não é possível empilhar!");
        else {
            elementos[quantidade] = elemento;
            quantidade++;
        }
    }

    //Remover o elemento e no topo da pilha – desempilhar()
    public char desempilhar() {
        if(estaVazia())
            return Character.MIN_VALUE;
        else {
            char removido = elementos[quantidade - 1];
            quantidade--;

            return removido;
        }        
    }

    //Acessar o elemento no topo da pilha – retornarElemento()
    public char retornarElemento() {
        if(estaVazia())
            return Character.MIN_VALUE;
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
    
    //Verificar anagrama
    public boolean verificaAnagrama(String primeiraPalavra, String segundaPalavra) {
        PilhaChar pilha1 = new PilhaChar();
        PilhaChar pilha2 = new PilhaChar();
        for (int i = 0; i < primeiraPalavra.length(); i++) {
            pilha1.empilhar(primeiraPalavra.charAt(i));
            pilha2.empilhar(segundaPalavra.charAt(i));
        }

        for(int i = 0; i < primeiraPalavra.length(); i++) {
            char caractereAtual = pilha1.desempilhar();

            pilha2 = pilha2.removerCaractere(pilha2, caractereAtual);

            if(primeiraPalavra.length() != segundaPalavra.length())
                return false;
        }

        if(pilha1.estaVazia() && pilha2.estaVazia())
            return true;
        else   
            return false;
    }

    private PilhaChar removerCaractere(PilhaChar pilha, char caractere) {
        PilhaChar pilhaAuxiliar = new PilhaChar();
        boolean jaRemoveu = false;
        int quantidade = pilha.getQuantidade();
        for (int i = 0; i < quantidade; i++) {
            char caractereAuxiliar = pilha.desempilhar();
            if(caractereAuxiliar != caractere || jaRemoveu)
                pilhaAuxiliar.empilhar(caractereAuxiliar);  
            else
                jaRemoveu = true;
        }
        return pilhaAuxiliar;
    }
}
