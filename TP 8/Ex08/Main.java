package Ex08;

public class Main {

    public static void main(String[] args) {

        MedidorCelsiuIF medidorC = new AdaptadorCelsius();
        MedidorFarenheit medidorF = new MedidorFarenheit();

        double temp = medidorC.medirTemperatura();

        System.out.println("\nTemperatura em Farenheit: " + medidorF.getTemperaturaFarenheit());
        System.out.println("Temperatura em Celsius: " + temp);

    }
}
