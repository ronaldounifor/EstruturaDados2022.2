public class Recursao {
    public int fatorial(int numero) {
        if(numero <= 1)
            return 1;
        
        return fatorial(numero - 1) * numero;
    }

    public int fibonacci(int posicao) {
        // ele: 1, 1, 2, 3, 5, 8, ...
        // pos: 1, 2, 3, 4, 5, 6, ...
        if(posicao <= 2)
            return 1;
        
        return fibonacci(posicao - 1) + fibonacci(posicao - 2);
    }
}
