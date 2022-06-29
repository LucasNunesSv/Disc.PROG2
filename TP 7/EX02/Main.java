package EX02;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Questão A
        Map<String, String> map = new HashMap<>();

        map.put("a1234", "Steve Jobs");
        map.put("a1235", "Scott McNealy");
        map.put("a1236", "Jeff Bezos");
        map.put("a1237", "Larry Ellison");
        map.put("a1238", "Bill Gates");

        System.out.println("\n" + map);

        System.out.println();

        //Questão B

        Set<String> chaves = map.keySet();

        for(String chave : chaves){
            System.out.println("Chave: " + chave + " / Nome: " + map.get(chave));
        }

        System.out.println("\nChave: a1239 / " + map.get("a1239") + " ( O retorno será vazio)\n");

        //Questão C

       buscaChave(map, "a1234");
       buscaChave(map, "A1234");

        //Questão D

        Funcionario p1 = new Funcionario("Steve Jobs", "Presidente", 12000);
        Funcionario p2 = new Funcionario("Scott McNealy", "Gerente RH", 7000);
        Funcionario p3 = new Funcionario("Jeff Bezos", "Contador", 8000);
        Funcionario p4 = new Funcionario("Larry Ellison", "Engenheiro de computação", 10000000);
        Funcionario p5 = new Funcionario("Bill Gates", "CEO", 900000000);

        Map<String, Funcionario> mapaObjetos = new HashMap<>();

        mapaObjetos.put("a1234", p1);
        mapaObjetos.put("a1235", p2);
        mapaObjetos.put("a1236", p3);
        mapaObjetos.put("a1237", p4);
        mapaObjetos.put("a1238", p5);

        System.out.println(mapaObjetos.get("a1234") + "\n");

        //Questão E

        System.out.println("\n_________ Funcionários Cadastrados __________\n\n");

        Set<String> chavesObj = mapaObjetos.keySet();

        for(String chave : chavesObj){
            System.out.println("Chave: " + chave + " / Dados: " + mapaObjetos.get(chave) + "\n");
        }
    }

    public static void buscaChave(Map<String, String> mapa, String chave){

        if(Character.isUpperCase(chave.charAt(0))){
            String chaveUp = chave.toLowerCase(Locale.ROOT);
            System.out.println("Chave: " + chaveUp + " / Dados: " + mapa.get(chaveUp) + "\n");
        }else {
            System.out.println("Chave: " + chave + " / Dados: " + mapa.get(chave) + "\n");
        }
    }

}


