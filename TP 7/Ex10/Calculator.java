package Ex10;

public class Calculator {

    public double div(double a, double b) throws InvalidOperationException {
        if(b == 0){
            InvalidOperationException e = new InvalidOperationException("Operação Inválida");
            throw e;
        }else {
            return a/b;
        }
    }

    public double log10(double a) throws InvalidOperationException{
        if(a <= 0){
            InvalidOperationException e = new InvalidOperationException("Operação Inválida");
            throw e;
        }else {
            return Math.log10(a);
        }
    }
}
