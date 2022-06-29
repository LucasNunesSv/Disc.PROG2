package Ex07;

public class Main {

    public static void main(String[] args) {

        SomadorExistente sEx = new SomadorExistente();
        //Não é possível utilizar o somador que possuimos

        SomadorEsperado sEs = new Adaptador();
        //Criamos um somadorEsperado utilizando o padrão Adapter

        Cliente Afonsinha = new Cliente(sEs);

        System.out.println();
        Afonsinha.executar();

    }
}
