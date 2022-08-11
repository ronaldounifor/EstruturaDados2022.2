import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new Lista(10);

        
        lista.adicionarFinal(1);
        lista.adicionarFinal(2);
        lista.adicionarFinal(3);
        lista.adicionarFinal(4);
        lista.adicionarFinal(5);
        lista.adicionarFinal(6);
        lista.adicionarFinal(7);
        lista.adicionarFinal(8);
        lista.adicionarFinal(9);
        lista.adicionarFinal(10);

        lista.removerInicio();
        lista.removerInicio();
        lista.removerInicio();
        lista.removerFinal();
        lista.removerFinal();
        lista.removerFinal();
        lista.removerPosicao(2);

        lista.exibir();

        JOptionPane.showMessageDialog(null, ""+lista.retornarElemento(0));
    }
}
