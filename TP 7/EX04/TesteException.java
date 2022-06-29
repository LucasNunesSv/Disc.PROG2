package EX04;

public class TesteException {

    public static void main(String[] args) {

        System.out.println("\nInício do main");
        metodo1();
        System.out.println("\nFim do main");
    }

    static void metodo1(){
        System.out.println("\nInício do método1");
        metodo2();
        System.out.println("\nFim do metodo1");
    }

    static void metodo2(){
        System.out.println("\nInício do método2");
        int [] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
            System.out.println("\nFim do metodo2");
        }catch (ArrayIndexOutOfBoundsException erro){
            System.out.println("\n!! Erro !!\nO código continuara executando");
        }
    }
}
