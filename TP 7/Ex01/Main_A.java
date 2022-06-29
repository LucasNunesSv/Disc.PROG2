package Ex01;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main_A {


    public static void main(String[] args) {

        Set<String> listaSet = new HashSet<String>();
        Scanner scan = new Scanner(System.in);
        ;
        String str, cond;
        int cont = 0, totalNomes = 0, num;

        do {
            try {
                System.out.print("\n      |---- MENU ----|\n" + "[1] - digitar série de nomes" +
                        "\n[2] - remover um nome\n[3] - Verificar se um nome ja foi armazenado\n[4] - " +
                        "Apagar todos os nomes\n[5] - Imprimir lista de nomes\n[6] - Sair\n\nDigite a opção: ");

                cont = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException o) {
                System.out.println("Erro: A entrada deve ser de números inteiros");
            }
            switch (cont) {
                case 1:
                    System.out.print("Quantos nomes serão digitados?: ");
                    num = scan.nextInt();
                    scan.nextLine();
                    for (int i = 0; i < num; i++) {
                        System.out.print("Digite o nome " + totalNomes + ": ");
                        str = scan.nextLine();
                        listaSet.add(str);
                        totalNomes++;
                    }
                    break;
                case 2:
                    System.out.print("Digite o nome que deseja remover: ");
                    str = scan.nextLine();
                    if (listaSet.contains(str)) {
                        listaSet.remove(str);
                    } else {
                        System.out.println("!!! Este nome não pertence a lista !!!\n");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome a ser verificado: ");
                    str = scan.nextLine();
                    if (listaSet.contains(str)) {
                        System.out.println("* O nome digitado está contido na Lista de Nomes !!");
                    } else
                        System.out.println("* O nome digitado NÃO está contido na Lista de Nomes !!");
                    break;
                case 4:
                    System.out.print("Tem certeza que deseja apagar todos os nomes da lista? (s ou n): ");
                    cond = scan.next();
                    if (cond.equals("S") || cond.equals("s")) {
                        System.out.println("Apagando todos os dados . . . ");
                        listaSet.clear();
                        System.out.println("Concluido ! ");
                    } else {
                        System.out.println("Operação não efetuada ! ");
                    }
                    break;
                case 5:
                    System.out.println(listaSet);
                    break;
                case 6:
                    System.out.println("Saindo . . . ");
                    break;
                default:
                    System.out.println("!! Operação inválida, tente novamente !!");
                    break;
            }
            System.out.print("\nDeseja fazer outra operação? (s ou n): ");
            System.out.println();
            cond = scan.next();
        } while (cond.equals("S") || cond.equals("s"));

    }
}
