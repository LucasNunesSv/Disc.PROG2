package Ex09;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {
            someMethod1();
        }catch (ArithmeticException e){
            System.out.println("\n!! Erro capturado no Main !!\n");
            e.printStackTrace();
        }

    }

    public static void someMethod1() throws ArithmeticException{
        someMethod2();
    }

    public static int someMethod2() throws ArithmeticException{
        int a = 1, b = 0;
        return a/b;
    }
}
