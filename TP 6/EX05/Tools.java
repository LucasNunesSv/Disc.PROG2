package EX05;

import java.util.Arrays;

public class Tools implements Ferramentas {

    private Animal[] animalFiltrado = new Animal[50];
    private String[] especieFiltarada = new String[50];
    private Resultado[] resultado = new Resultado[50];
    private int cont = 0;
    private int quantidade;

    public int getQuantidade() {
        return cont;
    }

    @Override
    public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
        for (int i = 0; i < completo.length; i++) {
            if (completo[i] != null) {
                if (completo[i].getNomeEspecie().equals(especieFiltrar)) {
                    this.animalFiltrado[cont] = completo[i];
                    this.cont++;
                }
            }
        }
        return this.animalFiltrado;
    }

    @Override
    public String[] classificaEspecies(Animal[] completo) {
        int tam = 0;
        for (int i = 0; i < completo.length; i++) {
            if (completo[i] != null) {
                this.especieFiltarada[i] = completo[i].getNomeEspecie();
            }
            tam++;
        }
        return Arrays.copyOf(especieFiltarada, tam);
    }

//    public int size(Animal[] animais){
//        for(int i = 0; i<animais.length; i++){
//            animais.
//        }
//        return
//    }
}
