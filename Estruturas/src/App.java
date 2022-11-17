import util.BTreePrinter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import estruturas.arvore.BST;
import estruturas.arvore.NoAB;

public class App {
    public static void main(String[] args) throws Exception {
        
        BST arvore = new BST();

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(20, 10, 5, 2, 3, 7, 40, 337, 21, 13, 77, 15, 11));

        Random random = new Random();
        int tamanho = numeros.size();
        for (int i = 1; i <= tamanho; i++) {
            int posicao = random.nextInt(numeros.size());

            int elemento = numeros.remove(posicao);
            arvore.adicionar(elemento);
        }

        BTreePrinter.printNode(arvore.getRaiz());
        NoAB no = arvore.buscarElemento(77);
        System.out.println(arvore.buscarPai(no.getElemento()).getElemento());
    }

}