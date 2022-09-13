import estruturas.Lista;
import estruturas.Pilha;
import estruturas.PilhaChar;

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();

        lista.adicionarFinal(1);
        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(4);
        lista.adicionarFinal(5);

        Lista lista2 = inverterListaUsandoLista(lista);
        lista2.exibir();
    }



    public static Lista inverterListaUsandoLista(Lista lista) {
        int numeroTrocas = lista.getQuantidade()/2;
        for (int i = 0; i < numeroTrocas; i++) {
            int elementoAux = lista.retornarElemento(i);
            int posicaoUltimo = lista.getQuantidade()-1-i;

            lista.removerPosicao(i);
            lista.adicionarPosicao(lista.retornarElemento(posicaoUltimo - 1), i);
            lista.removerPosicao(posicaoUltimo);
            lista.adicionarPosicao(elementoAux, posicaoUltimo);
        }
        return lista;
    }
}
