public class Vetor {

    private String[] elements;

    public Vetor(int capacidade) {
        this.elements = new String[capacidade];
    }

    public void adicionar(String element) {
        for(int i = 0; i < this.elements.length; i++) {
            if(this.elements[i] == null) {
                this.elements[i] = element;
                break;
            }
        }
    }
}