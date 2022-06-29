package EX03;

import EX03.Empregado;

import java.util.Comparator;

public class Salario_Comparator implements Comparator<Empregado> {

    @Override
    public int compare(Empregado e1, Empregado e2){
        if(e1.getSalario() > e2.getSalario()){
            return  1;
        }
        if(e1.getSalario() < e2.getSalario()){
            return -1;
        }
        return 0;
    }
}
