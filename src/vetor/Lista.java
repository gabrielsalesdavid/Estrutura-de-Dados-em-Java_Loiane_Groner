package vetor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lista<T> {
    private T[] elements;
    private int tamanho;

    public Lista(int capacidade, Class<T> tipoClasse) {
        this.elements = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    public void adicionar(T element) {
        for(int i = 0; i < this.elements.length; i++) {
            if(this.elements[i] == null) {
                this.elements[i] = element;
                break;
            }
        }
    }

    public void adiciona (T element) throws Exception {
        if(this.tamanho < this.elements.length) {
            this.elements[this.tamanho] = element;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possivel adicionar mais");
        }
    }
    public boolean adiciona01 (T element) {
        if(this.tamanho < this.elements.length) {
            this.elements[this.tamanho] = element;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona02(int posicao, T element) {
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

    public T busca01(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elements[posicao];
    }

    public int busca(T element) {
        for(int i = 0; i < this.tamanho; i++) {
            if(this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int ultimoIndice(T element) {
        int ultimaPos = -1;
        for(int i = this.tamanho - 1; i >= 0; i--) {
            if(this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contem(T element) {
        return this.busca(element) != -1;
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

    public Object busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("A posição invalida");
        }
        return this.elements[posicao];
    }

    @Override
    public String toString() {
        return "VetorObjetos{" +
                "elements=" + Arrays.toString(elements) +
                ", tamanho=" + tamanho +
                '}';
    }
}