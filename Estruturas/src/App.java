import estruturas.Pilha;
import estruturas.PilhaChar;

public class App {
    public static void main(String[] args) throws Exception {
        PilhaChar pilha = new PilhaChar();

        System.out.println(
            pilha.verificaAnagrama("barar", "rraab")
            );
    }
}
