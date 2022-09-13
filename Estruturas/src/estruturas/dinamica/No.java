package estruturas.dinamica;

public class No {
    private int elemento;
    private No proximo;

    public No() {
        elemento = 0;
        proximo = null;
    }

    public No(int elemento) {
        this.elemento = elemento;
        proximo = null;
    }

    public int getElemento() {
        return this.elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getProximo() {
        return this.proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}