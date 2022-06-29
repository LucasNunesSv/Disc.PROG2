package EX03;

import EX03.Empregado;

import java.util.Comparator;

public class Nome_comparator implements Comparator<Empregado> {

    @Override
    public int compare(Empregado e1, Empregado e2){
        return e1.getNome().compareTo(e2.getNome());
    }
}
