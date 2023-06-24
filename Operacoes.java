package sp.senai.br.operacoes;

import java.util.Scanner;


public class Operacoes {
    
    public static Scanner teclado = new Scanner(System.in);
    
    public static double soma(double valor1, double valor2){
        return valor1 + valor2;
    }

  public static double max(double[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        double max = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i];
            }
        }
      return max;
  }
    public static double min(double[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

     double min = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < min) {
                min = vetor[i];
            }
        }

        return min;
    }
}
