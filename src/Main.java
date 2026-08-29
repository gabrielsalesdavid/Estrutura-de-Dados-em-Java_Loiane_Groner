import vetor.Vetor;
import vetor.VetorObjetos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        VetorObjetos veto = new VetorObjetos(10);
        veto.tamanho();

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");

        System.out.println(arrayList);
        System.out.println(arrayList.get(0));

        arrayList.remove("3");
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}