package Ex08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = 0, b = 0, result = 0;

        System.out.println("\n// Para este exercício é interessante que se use entradas inválidas ( letras ou numeros racionais)" +
                " ou execute uma divisão por 0 (zero) //\n");

        try {
            System.out.print("Forneça o numerador: ");
            a = scan.nextInt();
            System.out.print("Forneça o denominador: ");
            b = scan.nextInt();
            result = divide(a, b);
            System.out.println("Resultado: " + result);
        }catch (InputMismatchException e){
            System.out.println("\n!! Erro de entrada !!\n\nImprimindo StackTrace\n");
            e.printStackTrace();
        }

        System.out.println("\nConclusão: Apenas um dos possíveis erros que o método 'divide' poderia retornar\nfoi tratado " +
                "no própio método. Sendo assim, ele não precisa capturar todos os possíveis \nerros gerados dentro do bloco try " +
                "pertencente ao metodo 'divide'\n");
    }

    public static int divide(int a, int b){
        try{
            return a / b;
        }catch (ArithmeticException e){
            System.out.println("\n!! Erro Aritimético !! \n\nImprimindo StackTrace: \n");
            e.printStackTrace();
            return  0;
        }
    }
}
