package Ex01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_B {

    public static void main(String[] args) {

        Set<Produto> listaSet = new HashSet<Produto>();
        Scanner scan = new Scanner(System.in);
        String cond = "n", nome;
        int cont, cod, totalProdutos = 0;
        double preco;

        System.out.println("\n       _______Bem vindo ao cadastro de produtos!_______\nBasta inserir" +
                " os dados de todos os produtos a serem cadastrados e \nao final" +
                "" + " um relatório será gerado com todos produtos cadastrados");

        do {
            System.out.print("\nInforme quantos produtos serão cadastrados: ");
            cont = scan.nextInt();

            for (int i = 0; i < cont; i++) {
                Produto p = new Produto(totalProdutos);
                if (listaSet.contains(p)) {
                    System.out.println("\n!!! Produtos Iguais !!!");
                    i--;
                } else {
                    listaSet.add(p);
                    totalProdutos++;
                }
            }

            System.out.print("\nDeseja cadastrar mais produtos? (s ou n) ");
            cond = scan.next();
//            if (cond.equals("N") || cond.equals("n")) {
//                System.out.println("\nImprimindo relatório . . . ");
//            }
//            if (cond.) {
//                System.out.println("!!! Operação inválida !!! \no programa sera finalizado, imprimindo dados cadastrados . . .");
//            }
        } while (cond.equals("S") || cond.equals("s"));

        System.out.println(listaSet);
    }
}
