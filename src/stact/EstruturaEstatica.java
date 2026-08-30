package stact;

import java.util.Arrays;

public class EstruturaEstatica<T> {

    protected T[] elements;
    protected int tamanho;

    public EstruturaEstatica() {
        this(10);
    }
    public EstruturaEstatica(int capacidade) {
        this.elements = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }
    public boolean estaVazio() {
        return this.tamanho == 0;
    }
    protected boolean adiciona (T element) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elements.length) {
            this.elements[this.tamanho] = element;
            this.tamanho++;
            return true;
        }
        return false;
    }
    public boolean adicionaPosicao(int posicao, T element) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        for(int i = this.tamanho - 1; i >= posicao; i--) {
            this.elements[i+1] = this.elements[i];
        }
        this.elements[posicao] = element;
        this.tamanho++;
        return false;
    }

    public void aumentaCapacidade() {
        if(this.tamanho == this.elements.length) {
            T[] elementsNew = (T[])new Object[this.elements.length * 2];
            for(int i = 0; i < this.elements.length; i++) {
                elementsNew[i] = this.elements[i];
            }
            this.elements = elementsNew;
        }
    }
    @Override
    public String toString() {
        return "VetorObjetos{" +
                "elements=" + Arrays.toString(elements) +
                ", tamanho=" + tamanho +
                '}';
    }

    protected void remove() {
        if(this.tamanho > 0) {
            this.elements[this.tamanho - 1] = null;
        }
    }
}