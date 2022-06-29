package ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        IntegerSet A = new IntegerSet();
        IntegerSet B = new IntegerSet();
        IntegerSet AuB = new IntegerSet();
        IntegerSet AiB = new IntegerSet();
        IntegerSet A_dif_B = new IntegerSet();
        IntegerSet B_dif_A = new IntegerSet();

        String str_A[] = new String[100];
        String str_B[] = new String[100];

        Scanner scan = new Scanner(System.in);
        int posi;
        String cond, lixo;
        char opr, conj;

        System.out.println("\nNº máximo de elementos = 100");

        do {
            System.out.println("\nEscolha em qual conjunto deseja fazer a operação");
            System.out.print("(Opções - A ou B) ");
            System.out.print("= ");
            conj = scan.next().charAt(0);
            if (conj == 'A' || conj == 'a') {
                System.out.println("\n ** Menu A **\n");
                System.out.println(" 1 - Insere elemento ");
                System.out.println(" 2 - exclui elemento ");
                System.out.print("\nDigite a operação desejada = ");
                opr = scan.next().charAt(0);

                switch (opr) {
                    case '1':
                        System.out.print("digite o número que deseja inserir = ");
                        posi = scan.nextInt();
                        A.insert(posi);
                        break;

                    case '2':
                        System.out.print("digite o número que deseja excluir = ");
                        posi = scan.nextInt();
                        A.delete(posi);
                        break;

                    default:
                        System.out.println(" !!!! Inválido !!!! ");
                        break;
                }

            }
            if (conj == 'B' || conj == 'b') {
                System.out.println(" ** Menu B **\n");
                System.out.println(" 1 - Insere elemento ");
                System.out.println(" 2 - exclui elemento ");
                System.out.print("\nDigite a operação desejada = ");
                opr = scan.next().charAt(0);

                switch (opr) {
                    case '1':
                        System.out.print("digite o número que deseja inserir = ");
                        posi = scan.nextInt();
                        B.insert(posi);
                        break;

                    case '2':
                        System.out.print("digite o número que deseja excluir = ");
                        posi = scan.nextInt();
                        B.delete(posi);
                        break;

                    default:
                        System.out.println(" !!!! Inválido !!!! ");
                        break;
                }

            }
            if (conj != 'A' && conj != 'a' && conj != 'B' && conj != 'b') {
                System.out.println(" !!! Inválido !!!");
            }
            System.out.print("\nDeseja repetir a operação? (S ou N) = ");
            lixo = scan.nextLine();
            cond = scan.nextLine();
        } while (cond.equals("S") || cond.equals("s"));

        AuB.uniao(A, B);
        AiB.intersecção(A, B);
        A_dif_B.diferença(A, B);
        B_dif_A.diferença(B, A);

        System.out.println("\nResultado final dos Conjuntos \n");

        System.out.print("A = ");
        A.print_conj();
        System.out.print("\nB = ");
        B.print_conj();
        System.out.print("\nAuB = ");
        AuB.print_conj();
        System.out.print("\nAiB = ");
        AiB.print_conj();
        System.out.print("\nA-B = ");
        A_dif_B.print_conj();
        System.out.print("\nB-A = ");
        B_dif_A.print_conj();

        str_A = A.return_string();
        str_B = B.return_string();

        System.out.println("\n\n ** Teste do metodo ~ return_string ~ **");
        impr_str(str_A);
        impr_str(str_B);
        System.out.println();

    }

    public static void impr_str(String str[]) {
        System.out.print("\n{ ");
        for (int i = 0; i < 100; i++) {
            if (str[i] != null) {
                System.out.print(str[i] + "-");
            }
        }
        System.out.print(" }");
    }
}
