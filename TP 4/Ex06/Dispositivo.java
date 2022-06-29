package Ex06;

import Ex02.Nota;
import Ex03.Melodia;
import Ex04.Letra;
import Ex05.Musica;

import java.util.Scanner;

public class Dispositivo {

    public static void main(String[] args) {

        //    Representação das Notas (cifra ou tablatura):
//
//    Dó = C
//    Ré = D
//    Mi = E
//    Fá = F
//    Sol = G
//    Lá = A
//    Si = B
//
//    # = sustenido  --  Ex: F# (Fá sustenido)
//    b = bemol  --  Ex: Bb (Si bemol)
        System.out.println("\n***** Bem vindo ao SongWriter2000 *****\n");
        System.out.println("\nA representação das Notas foi feita em formato de cifra:\n\nDó = C\n" +
                "Ré = D\nMi = E\nFá = F\nSol = G\nLá = A\nSi = B\n" +
                "# = sustenido  --  Ex: F# (Fá sustenido)\nb = bemol  --  " +
                "Ex: Bb (Si bemol)\n");


        Nota Do = new Nota("C", 0);
        Nota Re = new Nota("D", 0);
        Nota Mi = new Nota("E", 0);
        Nota Fa = new Nota("F", 0);
        Nota Sol = new Nota("G", 0);
        Nota La = new Nota("A", 0);
        Nota Si = new Nota("B", 0);

        Nota Re_b = new Nota("D", 0);
        Re_b.to_bemol();
        Nota Mi_b = new Nota("E", 0);
        Mi_b.to_bemol();
        Nota Sol_b = new Nota("G", 0);
        Sol_b.to_bemol();
        Nota La_b = new Nota("A", 0);
        La_b.to_bemol();
        Nota Si_b = new Nota("B", 0);
        Si_b.to_bemol();

        Nota Do_s = new Nota("C", 0);
        Do_s.to_sustenido();
        Nota Re_s = new Nota("D", 0);
        Re_s.to_sustenido();
        Nota Fa_s = new Nota("F", 0);
        Fa_s.to_sustenido();
        Nota Sol_s = new Nota("G", 0);
        Sol_s.to_sustenido();
        Nota La_s = new Nota("A", 0);
        La_s.to_sustenido();

        Melodia melodia = new Melodia();
        Letra letra = new Letra();
        Scanner scan = new Scanner(System.in);
        String Cond1, Cond3, Cond4, texto, lixo;
        int Cond2, num, contador = 0;

        do {
            System.out.println("Menu: \n(1) - Adicionar frase a letra da música\n(2) - Adicionar notas a melodia da música\n" +
                    "(3) - Imprimir música\n(4) - Sair");
            System.out.print("\nDigite a opção: ");
            Cond2 = scan.nextInt();
            if (Cond2 == 1) {
                System.out.print("Digite a frase: ");
                lixo = scan.nextLine();
                texto = scan.nextLine();
                System.out.print("Digite o tempo de duração: ");
                num = scan.nextInt();
                letra.adc_frase(texto, num);
                System.out.println("Esta frase devera ser repetida? {bis} (s ou n)");
                Cond3 = scan.next();
                if (Cond3.equals("S") || Cond3.equals("s")) {
                    letra.bis(contador);
                }
                System.out.println("Esta frase é o refrão da música? (s ou n)");
                Cond4 = scan.next();
                if (Cond4.equals("S") || Cond4.equals("s")) {
                    letra.to_refrao(contador);
                }
                System.out.println("!! Frase *" + contador + "* adicionada com sucesso");
            }
            if (Cond2 == 2) {
                do {
                    System.out.println("Notas disponíveis: (C,D,E,F,G,A,B) * Olhar a tabela de conversão\nDigite a nota: ");
                    texto = scan.next();
                    System.out.println("Digite o tempo de duração: ");
                    num = scan.nextInt();
                    switch (texto) {
                        case "C":
                            System.out.println("Esta nota é sustenida? *#* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Do_s, num);
                            } else {
                                melodia.adc_nota(Do, num);
                            }
                            break;
                        case "c":
                            System.out.println("Esta nota é sustenida? *#* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Do_s, num);
                            } else {
                                melodia.adc_nota(Do, num);
                            }
                            break;
                        case "D":
                            System.out.println("Esta nota é sustenida? *#* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Re_s, num);
                            } else {
                                System.out.println("Esta nota é bemol? *b* (s ou n): ");
                                Cond4 = scan.next();
                                if (Cond4.equals("S") || Cond4.equals("s")) {
                                    melodia.adc_nota(Re_b, num);
                                } else {
                                    melodia.adc_nota(Re, num);
                                }
                            }
                            break;
                        case "d":
                            System.out.println("Esta nota é sustenida? *#* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Re_s, num);
                            } else {
                                System.out.println("Esta nota é bemol? *b* (s ou n): ");
                                Cond4 = scan.next();
                                if (Cond4.equals("S") || Cond4.equals("s")) {
                                    melodia.adc_nota(Re_b, num);
                                } else {
                                    melodia.adc_nota(Re, num);
                                }
                            }
                            break;
                        case "E":
                            System.out.println("Esta nota é bemol? *b* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Mi_b, num);
                            } else {
                                melodia.adc_nota(Mi, num);
                            }
                            break;
                        case "e":
                            System.out.println("Esta nota é bemol? *b* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Mi_b, num);
                            } else {
                                melodia.adc_nota(Mi, num);
                            }
                            break;
                        case "F":
                            System.out.println("Esta nota é sustenida? *#* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Fa_s, num);
                            } else {
                                melodia.adc_nota(Fa, num);
                            }
                            break;
                        case "f":
                            System.out.println("Esta nota é sustenida? *#* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Fa_s, num);
                            } else {
                                melodia.adc_nota(Fa, num);
                            }
                            break;
                        case "G":
                            System.out.println("Esta nota é sustenida? *#* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Sol_s, num);
                            } else {
                                System.out.println("Esta nota é bemol? *b* (s ou n): ");
                                Cond4 = scan.next();
                                if (Cond4.equals("S") || Cond4.equals("s")) {
                                    melodia.adc_nota(Sol_b, num);
                                } else {
                                    melodia.adc_nota(Sol, num);
                                }
                            }
                            break;
                        case "g":
                            System.out.println("Esta nota é sustenida? *#* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Sol_s, num);
                            } else {
                                System.out.println("Esta nota é bemol? *b* (s ou n): ");
                                Cond4 = scan.next();
                                if (Cond4.equals("S") || Cond4.equals("s")) {
                                    melodia.adc_nota(Sol_b, num);
                                } else {
                                    melodia.adc_nota(Sol, num);
                                }
                            }
                            break;
                        case "A":
                            System.out.println("Esta nota é sustenida? *#* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(La_s, num);
                            } else {
                                System.out.println("Esta nota é bemol? *b* (s ou n): ");
                                Cond4 = scan.next();
                                if (Cond4.equals("S") || Cond4.equals("s")) {
                                    melodia.adc_nota(La_b, num);
                                } else {
                                    melodia.adc_nota(La, num);
                                }
                            }
                            break;
                        case "a":
                            System.out.println("Esta nota é sustenida? *#* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(La_s, num);
                            } else {
                                System.out.println("Esta nota é bemol? *b* (s ou n): ");
                                Cond4 = scan.next();
                                if (Cond4.equals("S") || Cond4.equals("s")) {
                                    melodia.adc_nota(La_b, num);
                                } else {
                                    melodia.adc_nota(La, num);
                                }
                            }
                            break;
                        case "B":
                            System.out.println("Esta nota é bemol? *b* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Si_b, num);
                            } else {
                                melodia.adc_nota(Si, num);
                            }
                            break;
                        case "b":
                            System.out.println("Esta nota é bemol? *b* (s ou n): ");
                            Cond3 = scan.next();
                            if (Cond3.equals("S") || Cond3.equals("s")) {
                                melodia.adc_nota(Si_b, num);
                            } else {
                                melodia.adc_nota(Si, num);
                            }
                            break;
                        default:
                            System.out.println("!! Nota inválida !!");
                    }
                } while (texto.charAt(0) != 'C' && texto.charAt(0) != 'c' && texto.charAt(0) != 'D' && texto.charAt(0) != 'd' &&
                        texto.charAt(0) != 'E' && texto.charAt(0) != 'e' && texto.charAt(0) != 'F' && texto.charAt(0) != 'f' &&
                        texto.charAt(0) != 'G' && texto.charAt(0) != 'g' && texto.charAt(0) != 'A' && texto.charAt(0) != 'a' &&
                        texto.charAt(0) != 'B' && texto.charAt(0) != 'b');
            }
            if (Cond2 == 3) {
                Musica Musica = new Musica(melodia, letra);
                System.out.println("\n\n_____________  Música  _____________\n\n");
                Musica.play();
            }
            if (Cond2 == 4) {
                System.out.println("Saindo...");
            }
            contador++;
            System.out.println("Deseja fazer outra operação? (s ou n)");
            System.out.println();
            Cond1 = scan.next();
        } while (Cond1.equals("S") || Cond1.equals("s"));

        Musica Musica = new Musica(melodia, letra);
    }
}
