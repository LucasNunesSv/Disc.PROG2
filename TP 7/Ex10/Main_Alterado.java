package Ex10;

import java.util.Scanner;

public class Main_Alterado {

    public static void main(String[] args) {

        Calculator_Alterado calc = new Calculator_Alterado();
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

                result = calc.div(a, b);
                System.out.println("\nResultado: " + result);

                break;
            case 2:
                System.out.print("\nDigite o número: ");
                a = scan.nextInt();
                    result = calc.log10(a);
                    System.out.println("\nResultado: " + result);
                break;
            default:
                System.out.println("!! Operação inválida !!");
                break;
        }

        System.out.println("\nO Retorno será NaN (Not a Number) ou infinity  para entradas Inválidas, que é um retorno padrão do java, \no tratamento de exceções" +
                " pode ser dispensado pois se trata de uma Unchecked Exception, um tipo de Exceção que não precisa necessariamente ser tratada");
    }
}
