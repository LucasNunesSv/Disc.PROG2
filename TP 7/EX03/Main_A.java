package EX03;

import java.util.*;

public class Main_A {

    public static void main(String[] args) {

        List<Integer> lista_int = new ArrayList<Integer>();

        //Pesquisei no site DevMédia e utilizei esta função que gera números aleatórios entre 1 e 99
        for(int i = 0; i<50; i++){
            lista_int.add((int)(Math.random() * 10) + 1);
        }

        System.out.println("\nLista: " + lista_int);

        System.out.println("\nMenor valor contido na lista: " + Collections.min(lista_int));
        System.out.println("\nMaior valor contido na lista: " + Collections.max(lista_int));

        int qtd = 0;
        for(Integer num : lista_int){
            if(num == Collections.min(lista_int)){
                qtd++;
            }
        }
        System.out.println("\nO menor número da lista (" + Collections.min(lista_int) + ") apareceu *" + qtd + "* vezes");

        Collections.sort(lista_int);

        System.out.println("\nLista em ordem crescente: \n" + lista_int);
    }
}
