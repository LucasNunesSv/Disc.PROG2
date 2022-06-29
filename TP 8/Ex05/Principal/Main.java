package Ex05.Principal;

import Ex05.Factory.*;

import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        Cliente claudete = new Cliente("Claudete");

        FabricaFord ford = new FabricaFord();
        FabricaFiat fiat = new FabricaFiat();

        claudete.setCarroSedan(fiat.criarCarroSedan("MQY5624", "Fiesta Sedan"));
        claudete.setCarroPopular(ford.criarCarroPopular("HCH5624", "Palio"));

        claudete.InfoCliente();
        System.out.println();

        //Outros Testes

        CarroSedan sedan = fiat.criarCarroSedan("HJH12345", "Palio");
        CarroPopular pop = fiat.criarCarroPopular("GHG4558", "Palio");
        CarroSedan sedan1 = ford.criarCarroSedan("GFG4789", "Palio");
        CarroPopular pop1 = ford.criarCarroPopular("GDF4521", "Fiesta Sedan");
        System.out.println();

        try {
            System.out.println(sedan);
            System.out.println(sedan1);
            System.out.println(pop);
            System.out.println(pop1);
        } catch (Exception e) {
            System.out.println("\n!!! Erro ao imprimir informações dos carros !!!");
            e.printStackTrace();
        }


    }
}
