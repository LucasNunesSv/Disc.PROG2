package EX03;

import EX03.Empregado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class Data_Comparator implements Comparator<Empregado> {

    @Override
    public int compare(Empregado e1, Empregado e2){

        LocalDate dataE1 = LocalDate.parse(e1.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate dataE2 = LocalDate.parse(e2.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        if(dataE1.isBefore(dataE2)){
            return -1;
        }
        if(dataE1.isAfter(dataE2)){
            return  1;
        }
        return 0;
    }
}
