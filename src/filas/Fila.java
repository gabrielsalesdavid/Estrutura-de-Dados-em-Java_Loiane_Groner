package filas;

import stact.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }
    public Fila(int capacidade) {
        super(capacidade);
    }
    public void enfileira(T element) {
        this.adiciona(element);
    }
    public T espiar() {
        if(this.estaVazio()){
            return null;
        }
        return this.elements[0];
    }
    public T desenfileira() {
        if(this.estaVazio()){
            return null;
        }
        this.remove();
        return this.elements[0];
    }
}