package vetor;

import java.sql.Array;
import java.util.Arrays;

public class Vetor {

    private String[] elements;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elements = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(String element) {
        for(int i = 0; i < this.elements.length; i++) {
            if(this.elements[i] == null) {
                this.elements[i] = element;
                break;
            }
        }
    }

    public void adiciona (String element) throws Exception {
        if(this.tamanho < this.elements.length) {
            this.elements[this.tamanho] = element;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possivel adicionar mais");
        }
    }
    public boolean adiciona01 (String element) {
        if(this.tamanho < this.elements.length) {
            this.elements[this.tamanho] = element;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona02(int posicao, String element) {
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
            String[] elementsNew = new String[this.elements.length * 2];
            for(int i = 0; i < this.elements.length; i++) {
                elementsNew[i] = this.elements[i];
            }
            this.elements = elementsNew;
        }
    }

    public String busca01(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elements[posicao];
    }

    public int busca(String element) {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = posicao; i < this.tamanho - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.tamanho--;
    }

    public int tamanho(){
        return this.tamanho();
    }

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("A posição invalida");
        }
        return this.elements[posicao];
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for(int i = 0; i < this.tamanho -1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }

        if(this.tamanho > 0) {
            s.append(this.elements[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }
}