package Ex04.Factory;

public class RT_Factory extends SanduicheFactory {

    @Override
    public Sanduiche criaSanduba() {
        return new Sanduiche("RT", "Bola", "Cheddar", "Peru", "Sem verdura");
    }

}
