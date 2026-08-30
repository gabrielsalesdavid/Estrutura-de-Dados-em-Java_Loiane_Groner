package vetor;

import stact.EstruturaEstatica;

import java.util.Arrays;

public class List02<T> extends EstruturaEstatica<T> {
    public List02(){
        super();
    }
    public List02(int capacidade){
        super(capacidade);
    }
    public boolean adiciona(T element) {
        return super.adiciona(element);
    }
    public boolean adicionaPosicao(int posicao, T element) {
        return super.adicionaPosicao(posicao, element);
    }
}