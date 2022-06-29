package Ex07;

import java.util.ArrayList;
import java.util.List;

public class Adaptador implements SomadorEsperado {

    private SomadorExistente se = new SomadorExistente();

    @Override
    public int somaVetor(int[] vetor) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < vetor.length; i++) {
            list.add(vetor[i]);
        }
        return se.somaLista(list);
    }
}
