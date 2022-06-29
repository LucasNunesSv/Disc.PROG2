package Ex10;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        double a = 0,b = 0, result;
        int operacao;

        System.out.print("\n--- Menu ---\n\n[1] - divisão\n[2] - Log10\nDigite a operação desejada: ");
        operacao = scan.nextInt();

        switch (operacao){
            case 1:
                System.out.print("\nDigite o numerador: ");
                a = scan.nextInt();
                System.out.print("Digite o denominador: ");
                b = scan.nextInt();
                try {
                    result = calc.div(a, b);
                    System.out.println("\nResultado: " + result);
                }catch (InvalidOperationException e){
                    System.out.println("\n!! Erro capturado !!\nImprimindo stackTrace: \n");
                    e.printStackTrace();
                }
                break;
            case 2:
                System.out.print("\nDigite o número: ");
                a = scan.nextInt();
                try {
                    result = calc.log10(a);
                    System.out.println("\nResultado: " + result);
                }catch (InvalidOperationException e){
                    System.out.println("\n!! Erro capturado !!\nImprimindo stackTrace: \n");
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("!! Operação inválida !!");
                break;
        }


    }
}
