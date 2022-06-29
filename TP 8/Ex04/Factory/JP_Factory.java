package Ex04.Factory;

public class JP_Factory extends SanduicheFactory {

    @Override
    public Sanduiche criaSanduba() {
        return new Sanduiche("JP", "Francês", "Mussarela", "Frango", "Com verdura");
    }

}
