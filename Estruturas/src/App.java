import util.BTreePrinter;

import estruturas.arvore.ArvoreBinaria;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArvoreBinaria arvore = new ArvoreBinaria();

        for (int i = 1; i <= 9; i++) {
            System.out.println("Adicionar elemento: " + i);
            arvore.adicionar(i);
            BTreePrinter.printNode(arvore.getRaiz());
        }
        
    }

}