import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) {
        double[] vetor = lerValores();
        double media = calcularMedia(vetor);
        
        mostrarMaioresQueMedia(vetor, media);
    }

    public static double[] lerValores() {
        Scanner sc = new Scanner(System.in);
        double[] valores = new double[12];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = sc.nextDouble();
        }

        sc.close();
        return valores;
    }

    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma / vetor.length;
    }

    public static void mostrarMaioresQueMedia(double[] vetor, double media) {
        System.out.println("\nValores maiores que a média (" + media + "):");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > media) {
                System.out.println("Posição " + i + " -> " + vetor[i]);
            }
        }
    }
}