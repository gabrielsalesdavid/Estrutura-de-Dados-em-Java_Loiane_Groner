package filas;

public class FilaPrioritaria<T> extends Fila<T> {

    public void enfileira(T element) {
        Comparable<T> aux = (Comparable<T>) element;
        int i;
        for(i = 0; i < this.tamanho; i++) {
            if(aux.compareTo(this.elements[i]) > 0) {
                break;
            }
        }
        this.adiciona(element);
    }
}