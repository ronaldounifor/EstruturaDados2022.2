package estruturas.dinamica;

public class NoDinamico {
    private int elemento;
    private NoDinamico proximo;
    private NoDinamico anterior;

    public NoDinamico() {
        elemento = 0;
        proximo = null;
        anterior = null;
    }

    public NoDinamico(int elemento) {
        this.elemento = elemento;
        proximo = null;
        anterior = null;
    }

    public int getElemento() {
        return this.elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public NoDinamico getProximo() {
        return this.proximo;
    }

    public void setProximo(NoDinamico proximo) {
        this.proximo = proximo;
    }

    public NoDinamico getAnterior() {
        return this.anterior;
    }

    public void setAnterior(NoDinamico anterior) {
        this.anterior = anterior;
    }
}