package estruturas.dinamica;

public class No<T> {
    private T elemento;
    private No<T> proximo;

    public No() {
        elemento = null;
        proximo = null;
    }

    public No(T elemento) {
        this.elemento = elemento;
        proximo = null;
    }

    public T getElemento() {
        return this.elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public No<T> getProximo() {
        return this.proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
}