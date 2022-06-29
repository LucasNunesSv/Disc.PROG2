package EX05;

import java.util.Arrays;

public class App {

    private Resultado[] resultado = new Resultado[50];
    private Animal[] animais = new Animais[50];
    private String[] especies = new String[50];
    private Tools[] ferramentas = new Tools[50];


    public Resultado[] contabilizador(Animal[] completo, Tools tools) {

        for (int n = 0; n < 50; n++) {
            this.resultado[n] = new Resultado();
        }

        this.especies = tools.classificaEspecies(completo);
        int tam = especies.length;
        String filtro[] = new String[50];

        int posi = 0, i, j, tamFinal = 0;
        for (i = 0; i < especies.length; i++) {
            for (j = 0; j < posi; j++) {
                if (this.especies[i].equals(filtro[j])) {
                    break;
                }
            }
            if (j == posi) {
                filtro[posi] = this.especies[i];
                posi++;
            }
        }

        Arrays.copyOf(filtro, posi);

        int qtd = 0, jaCadastrado = 0;

        for (int l = 0; l < filtro.length; l++) {
            this.resultado[l].setNomeEspecie(filtro[l]);

            this.animais = tools.filtraEspecie(completo, filtro[l]);

            qtd = 0;
            for (int m = 0; m < this.animais.length; m++) {
                if (this.animais[m] != null) {
                    qtd++;
                }

            }
            this.resultado[l].setQuantidade(qtd /*- jaCadastrado*/);
            jaCadastrado = qtd;
            this.animais = null;
        }

        resultado = Arrays.copyOf(resultado, posi);
        return this.resultado;
    }
}
