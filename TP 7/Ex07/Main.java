package Ex07;

import Ex06.ContaException;

public class Main {

    public static void main(String[] args) {

        Conta_2 c1 = new Conta_2();
        double saldo_retornado = 0;

        c1.setLimite(1000);
        c1.deposita(100);

        System.out.println("\n" + c1);

        // Exceção tratada
        try {
            c1.saca(200);
        }catch (ContaException e){
            System.out.println("Erro encontrado");
            saldo_retornado = c1.getSaldo();
        }

        System.out.println("\nSaldo encontrado antes do Erro: " + saldo_retornado);

    }
}
