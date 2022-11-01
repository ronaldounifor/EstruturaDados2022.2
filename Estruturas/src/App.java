import util.BTreePrinter;
import estruturas.arvore.ArvoreBinaria;
import estruturas.arvore.NoAB;

public class App {
    public static void main(String[] args) throws Exception {
        
        NoAB raiz = new NoAB(5);
        ArvoreBinaria arvore = new ArvoreBinaria(raiz);

        arvore.adicionarEsquerda(4, raiz);
        arvore.adicionarDireita(12, raiz);

        BTreePrinter.printNode(raiz);

        NoAB resultado = arvore.buscarPai(4);

        if(resultado == null)
            System.out.println("Não foi encontrado!");
        else
            System.out.println("Encontramos o '"+resultado.getElemento()+"'");
        
    }

}