package sp.senai.br.operacoes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operacoes biblioteca = new Operacoes();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor para a soma: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor para a soma: ");
        double valor2 = scanner.nextDouble();
        
        double soma = biblioteca.soma(valor1, valor2);
        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();
        
        double[] vetor = new double[tamanhoVetor];
        
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = scanner.nextDouble();
        }
        
        double max = biblioteca.max(vetor);
        double min = biblioteca.min(vetor);
        
        System.out.println("Soma: " + soma);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        
        scanner.close();
    }
}