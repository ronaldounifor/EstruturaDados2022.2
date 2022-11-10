package estruturas.arvore;

import estruturas.dinamica.FilaEncadeada;
import estruturas.dinamica.No;

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
    public int nivelElemento(int elemento) {
        NoAB no = buscarElemento(elemento);

        if(raiz == no)
            return 0;

        NoAB noPai = buscarPai(elemento);

        if(noPai != null)
            return nivelElemento(noPai.getElemento()) + 1;
        else
            return -1;
    }

    // Resgatar a altura da árvore – alturaArvore()
    public int alturaArvore() {
        return alturaElemento(raiz);        
    }

    private int alturaElemento(NoAB no) {
        if(raiz == null)
            return 0;

        int alturaEsquerda = 0;
        if(no.getEsquerda() != null)
            alturaEsquerda = alturaElemento(no.getEsquerda());
        
        int alturaDireita = 0;
        if(no.getDireita() != null)
            alturaDireita = alturaElemento(no.getDireita());

        if(alturaEsquerda > alturaDireita)
            return alturaEsquerda + 1;
        else
            return alturaDireita + 1;
    }


    // Adicionar e à esquerda de p – adicionarEsquerda(e, p)
    public void adicionarEsquerda(int elemento, int pai) {
        NoAB noPai = buscarElemento(pai);
        noPai.setEsquerda(new NoAB(elemento));
    }

    // Adicionar um elemento e à direita de p – adicionarDireita(e, p)
    public void adicionarDireita(int elemento, int pai) {
        NoAB noPai = buscarElemento(pai);
        noPai.setDireita(new NoAB(elemento));
    }

    public void adicionar(int elemento) {
        NoAB no = new NoAB(elemento);

        if(raiz == null) {
            raiz = no;
            return;
        }

        FilaEncadeada fila = new FilaEncadeada();
        fila.enfileirar(new No<>(raiz.getElemento()));
        
        while(!fila.estaVazia()) {
            NoAB noAux = buscarElemento((Integer)fila.desenfileirar().getElemento());

            if(noAux.getEsquerda() == null) {
                noAux.setEsquerda(no);
                return;
            }
            if(noAux.getDireita() == null) {
                noAux.setDireita(no);
                return;
            }
            
            fila.enfileirar(new No<>(noAux.getEsquerda().getElemento()));
            fila.enfileirar(new No<>(noAux.getDireita().getElemento()));
        }
    }
    
    //FIXME otimizar
    // Remover o elemento e – removerElemento(e)
    public NoAB removerElemento(int elemento) {
        NoAB noPai = buscarPai(elemento);
        // Nó sem filho: A referência do nó pai é ajustado para nulo;
        NoAB no = buscarElemento(elemento);
        if(ehFolha(no)) {
            if(no == noPai.getEsquerda())
                noPai.setEsquerda(null);
            else
                noPai.setDireita(null);
        }

        // Nó com um filho: A referência do nó pai aponta para o filho do nó a ser excluído;
        // O conectivo lógico XOR é definido pelo operador '^' em Java
        if(no.getEsquerda() != null ^ no.getDireita() != null) {
            if(no.getEsquerda() != null) {
                if(no == noPai.getEsquerda())
                    noPai.setEsquerda(no.getEsquerda());
                else
                    noPai.setDireita(no.getEsquerda());
            } else {
                if(no == noPai.getEsquerda())
                    noPai.setEsquerda(no.getDireita());
                else
                    noPai.setDireita(no.getDireita());
            }

        }

        // Nó com dois filhos: Existe uma técnica especial para remover esse tipo de nó, chamada de Fusão.
        if(no.getEsquerda() != null && no.getDireita() != null) {
            if(no == noPai.getEsquerda()) {
                NoAB novoEsquerda = no.getEsquerda();
                noPai.setEsquerda(novoEsquerda);

                if(ehFolha(novoEsquerda)) {
                    novoEsquerda.setEsquerda(no.getDireita());
                } else {
                    NoAB noAux = novoEsquerda.getEsquerda();
                    while(!ehFolha(noAux))
                        noAux = noAux.getEsquerda();
                    noAux.setEsquerda(no.getDireita());
                }
            } else {
                NoAB novoDireita = no.getDireita();
                noPai.setDireita(novoDireita);

                if(ehFolha(novoDireita)) {
                    novoDireita.setDireita(no.getEsquerda());
                } else {
                    NoAB noAux = novoDireita.getDireita();
                    while(!ehFolha(noAux))
                        noAux = noAux.getDireita();
                    noAux.setDireita(no.getEsquerda());
                }
            }
        }

        //set filhos para nulo
        no.setEsquerda(null);
        no.setDireita(null);

        return no;
    }

    private boolean ehFolha(NoAB no) {
        return no.getEsquerda() == null && no.getDireita() == null;
    }

    public NoAB getRaiz() {
        return raiz;
    }
}
