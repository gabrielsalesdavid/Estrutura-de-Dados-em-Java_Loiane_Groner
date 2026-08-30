package pilhas;

import stact.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(){
        super();
    }
    public Pilha(int capacidade){
        super(capacidade);
    }
    public void empilha(T elemento){
        super.adiciona(elemento);
    }
    public T topo() {
        if(this.estaVazio()) {
            return null;
        }
        return this.elements[tamanho - 1];
    }
    public T desempilha(){
        if(this.estaVazio()) {
            return null;
        }
        return this.elements[--tamanho];
    }
}