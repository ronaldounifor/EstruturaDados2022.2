import javax.swing.JOptionPane;

public class Lista {
    private int[] elementos;
    private int quantidade;

    //Criar uma nova lista – Lista()
    public Lista() {
        elementos = new int[5];
        quantidade = 0;
    }

    public Lista(int limite) {
        elementos = new int[limite];
        quantidade = 0;
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

    /**
     * Acessar o elemento na posição i – retornarElemento(i)
     * A primeira posição é zero
     * @param posicao
     * @return
     */
    public int retornarElemento(int posicao) {
        if(entradaValida(posicao))
            return elementos[posicao];
        else
            return -1;
    }

    //Checa se a posicao desejada é valida, ou seja, está dentro do vetor de elementos
    private boolean entradaValida(int posicao) {
        if(posicao >= 0 && posicao <= quantidade)
            return true;
        else
            return false;
    }

    //Inserir um elemento e na posição i – adicionarPosicao(e, i)
    public void adicionarPosicao(int elemento, int posicao) {
        if(estaCheia())
            System.out.println("Lista está cheia!");
        else if(entradaValida(posicao)) {
            for(int i = quantidade - 1; i >= posicao; i--)
                elementos[i+1] = elementos[i];
                
            elementos[posicao] = elemento;
            quantidade++;
        }
    }

    //Inserir um elemento e no início – adicionarInicio(e)
    public void adicionarInicio(int elemento) {
        adicionarPosicao(elemento, 0);
    }

    //Inserir um elemento e no final – adicionarFinal(e)
    public void adicionarFinal(int elemento) {
        adicionarPosicao(elemento, quantidade);
    }

    //Remover o elemento e na posição i – removerPosicao(i)
    public void removerPosicao(int posicao) {
        if(estaVazia())
            System.out.println("Lista está vazia!");
        else if(entradaValida(posicao)) {
            
            for(int i = posicao; i < quantidade - 1; i++)
                elementos[i] = elementos[i+1];
            
            quantidade--;
        }
    }

    //Remover o elemento no inicio – removerInicio()
    public void removerInicio() {
        removerPosicao(0);
    }

    //Remover o elemento no final – removerFinal()
    public void removerFinal() {
        removerPosicao(quantidade - 1);
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