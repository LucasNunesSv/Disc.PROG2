package Ex08;

public class AdaptadorCelsius implements MedidorCelsiuIF {

    private MedidorFarenheit mF = new MedidorFarenheit();

    @Override
    public double medirTemperatura() {
        double F = mF.getTemperaturaFarenheit();
        double C = (F - 32) / 1.8;
        return C;
    }
}
