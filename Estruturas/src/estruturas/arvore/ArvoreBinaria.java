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
        else
            return resultado;

        return resultado;
    }

    // Descobre o pai de um elemento e – buscarPai(e)
    // Retornar o nível do elemento e – nivelElemento(e)
    // Resgatar a altura da árvore – alturaArvore()
    // Inserir um elemento e à direita de p – adicionarDireita(e, p)
    // Adicionar e à esquerda de p – adicionarEsquerda(e, p)
    // Remover o elemento e – removerElemento(e)
}
