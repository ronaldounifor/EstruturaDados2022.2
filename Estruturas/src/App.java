public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista();

        lista.adicionarInicio(2);
        lista.adicionarFinal(1);
        lista.adicionarPosicao(8, 1);
        lista.adicionarPosicao(7, 2);
        lista.adicionarPosicao(6, 0);

        lista.exibir();
    }
}
