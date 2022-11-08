import util.BTreePrinter;
import estruturas.arvore.ArvoreBinaria;
import estruturas.arvore.NoAB;

public class App {
    public static void main(String[] args) throws Exception {
        
        NoAB raiz = new NoAB(1);
        ArvoreBinaria arvore = new ArvoreBinaria(raiz);

        arvore.adicionarDireita(7, 1);
        arvore.adicionarEsquerda(6, 1);
        arvore.adicionarEsquerda(2, 7);
        arvore.adicionarDireita(8, 7);
        arvore.adicionarEsquerda(3, 2);
        arvore.adicionarDireita(4, 2);
        arvore.adicionarEsquerda(5, 8);
        arvore.adicionarDireita(9, 8);
        

        BTreePrinter.printNode(raiz);


        System.out.println(arvore.alturaArvore());
        
    }

}