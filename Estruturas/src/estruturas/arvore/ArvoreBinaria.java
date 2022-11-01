package estruturas.arvore;

public class ArvoreBinaria {
    private NoAB raiz;
    
    // Criar uma nova árvore – Arvore()
    public ArvoreBinaria() {
        this.raiz = null;
    }

    public ArvoreBinaria(NoAB raiz) {
        this.raiz = raiz;
    }

    // Verificar se a árvore está vazia – estaVazia()
    public boolean estaVazia() {
        if(raiz == null)
            return true;
        else
            return false;
    }

    // Buscar um determinado elemento e – buscarElemento(e)
    public NoAB buscarElemento(int elemento) {
        return buscarElemento(elemento, raiz);
    }

    private NoAB buscarElemento(int elemento, NoAB noAtual) {
        if(estaVazia() || noAtual == null) return null;
        
        if(elemento == noAtual.getElemento()) return noAtual;
        
        NoAB resultado = buscarElemento(elemento, noAtual.getEsquerda());
        if(resultado == null)
            resultado = buscarElemento(elemento, noAtual.getDireita());

        return resultado;
    }

    // Descobre o pai de um elemento e – buscarPai(e)
    public NoAB buscarPai(int elemento) {
        return buscarPai(elemento, raiz);
    }

    private NoAB buscarPai(int filho, NoAB noAtual) {
        if(estaVazia() || noAtual == null) return null;

        if(noAtual.getEsquerda() != null && noAtual.getEsquerda().getElemento() == filho)
            return noAtual;
        
        if(noAtual.getDireita() != null && noAtual.getDireita().getElemento() == filho)
            return noAtual;

        NoAB resultado = buscarPai(filho, noAtual.getEsquerda());
        if(resultado == null)
            resultado = buscarPai(filho, noAtual.getDireita());

        return resultado;
    }

    // Retornar o nível do elemento e – nivelElemento(e)
    // Resgatar a altura da árvore – alturaArvore()
    // Adicionar e à esquerda de p – adicionarEsquerda(e, p)
    public void adicionarEsquerda(int elemento, NoAB pai) {
        pai.setEsquerda(new NoAB(elemento));
    }

    // Adicionar um elemento e à direita de p – adicionarDireita(e, p)
    public void adicionarDireita(int elemento, NoAB pai) {
        pai.setDireita(new NoAB(elemento));
    }

    // TODO Desafio: Adicionar elemento
    
    // Remover o elemento e – removerElemento(e)
    public NoAB removerElemento(int elemento) {
        NoAB noPai = buscarPai(elemento);
        //TODO terminar
        return noPai;
    }
}
