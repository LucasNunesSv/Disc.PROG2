package Ex04.Factory;

public class CG_Factory extends SanduicheFactory {

    @Override
    public Sanduiche criaSanduba() {
        return new Sanduiche("CG", "Integral", "Prato", "Frango", "Sem verdura");
    }

}
