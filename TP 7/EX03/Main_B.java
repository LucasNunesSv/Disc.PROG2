package EX03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_B {

    public static void main(String[] args) {

        List<Empregado> lista_empregados = new ArrayList<Empregado>();

        Empregado e1 = new Empregado(158, "Lucas", 1500, "2021-12-02");
        lista_empregados.add(e1);
        Empregado e2 = new Empregado(189, "Luan", 5666, "2020-02-13");
        lista_empregados.add(e2);
        Empregado e3 = new Empregado(716, "Laura", 8974, "2019-05-05");
        lista_empregados.add(e3);
        Empregado e4 = new Empregado(271, "Patricia", 1200, "2020-08-15");
        lista_empregados.add(e4);
        Empregado e5 = new Empregado(581, "Phaustos", 2000, "2021-01-13");
        lista_empregados.add(e5);
        Empregado e6 = new Empregado(897, "Lucan", 7110, "2021-07-13");
        lista_empregados.add(e6);


        Salario_Comparator Sc = new Salario_Comparator();
        Nome_comparator Nc = new Nome_comparator();
        Data_Comparator Dc = new Data_Comparator();


        System.out.println(lista_empregados);

        Collections.shuffle(lista_empregados);

        System.out.println("\n|  *  *  *  *  *  * Lista embaralhada *  *  *  *  *  *  |\n\n" + lista_empregados);

        Collections.sort(lista_empregados, Sc);

        System.out.println("\n|  *  *  *  *  *  * Lista Ordenada pelo Salário  *  *  *  *  *  *  |\n\n" + lista_empregados);

        Collections.sort(lista_empregados, Nc);

        System.out.println("\n|  *  *  *  *  *  * Lista em Ordem Alfabética de Nomes  *  *  *  *  *  *  |\n\n" + lista_empregados);

        Empregado max = Collections.max(lista_empregados, Sc);
        Empregado min = Collections.min(lista_empregados, Sc);

        System.out.println("\n|----- Demais informações -----|\n\nFuncionário com maior salário: " + max.getNome());
        System.out.println("\nFuncionário com menor salário: " + min.getNome());

        max = Collections.max(lista_empregados, Dc);
        min = Collections.min(lista_empregados, Dc);

        System.out.println("\nFuncionário com menor Tempo de casa: " + max.getNome());
        System.out.println("\nFuncionário com maior Tempo de casa: " + min.getNome());

    }
}
