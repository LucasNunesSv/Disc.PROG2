package Ex04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DVD[] dvd = new DVD[50];
        int cont_DVD = 0;
        CD[] cd = new CD[50];
        int cont_CD = 0;

        for (int i = 0; i < 50; i++) {
            cd[i] = new CD();
            dvd[i] = new DVD();
        }

        Scanner scan = new Scanner(System.in);
        String cond = new String();
        int option = 0, valida;

        System.out.println("\n---- Bem vindo ao MidiTeca ----");
        do {
            System.out.println("\n**** Menu ****\n[1] - Cadastrar CD\n[2] - Cadastrar DVD\n[3] - Exibir CDs e DVDs cadastrados\n[4] - Sair\n");
            System.out.print("Digite a opeção desejada: ");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    cd[cont_CD].inserirDados();
                    cont_CD++;
                    break;
                case 2:
                    dvd[cont_DVD].inserirDados();
                    cont_DVD++;
                    break;
                case 3:
                    System.out.println("\n-------- Seção de CDs --------\n");
                    for (int i = 0; i < cont_CD; i++) {
                        cd[i].printDados();
                    }
                    System.out.println("-------- Seção de DVDs --------");
                    for (int i = 0; i < cont_DVD; i++) {
                        dvd[i].printDados();
                    }
                    break;
                case 4:
                    System.out.println("\n!! Obigado por Usar o MidiaTeca 😊");
                    System.out.println("\n!! Saindo !!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("!!! Operação Inválida !!!! - Tente novamente");
                    break;
            }
            do {
                System.out.print("Deseja fazer outra operação? (s ou n): ");
                cond = scan.next();
                if (cond.equals("S") || cond.equals("s") || cond.equals("N") || cond.equals("n")) {
                    valida = 1;
                } else {
                    System.out.println("!! operação inválida !! - Tente novamente");
                    valida = 0;
                }
            } while (valida == 0);
        } while (cond.equals("S") || cond.equals("s"));
        System.out.println("Obigado por Usar o MidiaTeca");
    }
}
