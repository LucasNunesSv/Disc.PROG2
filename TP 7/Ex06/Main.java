package Ex06;

public class Main {

    public static void main(String[] args) {

        Conta c1 = new Conta();

        c1.setLimite(1000);
        c1.deposita(100);

        System.out.println("\n" + c1);

        // Exceção tratada
        try {
            c1.saca(200);
        }catch (ContaException e){
            System.out.println("Erro capturado");
        }

        // Exceção Não tratada
        c1.saca(200);
    }
}
