package Ex05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado;
        System.out.println("\nEu sei dividir!");
        boolean cond = true;
        do {
            try {
                teclado = new Scanner(System.in);
                System.out.print("\nInforme o primeiro valor: ");
                int x = teclado.nextInt();
                System.out.print("Informe o segundo valor: ");
                int y = teclado.nextInt();
                double r = (x / y);
                System.out.println("\nO resultado da divisão é " + r);
                cond = false;
            } catch (ArithmeticException | InputMismatchException erro) {
                System.out.println("!! Entrada inválida");
            }
        }while (cond);
    }
}
