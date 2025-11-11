import java.util.Scanner;

public class exer06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        double[] vetor = lerVetor(sc, n);

        System.out.print("\nInforme um valor para buscar: ");
        double valor = sc.nextDouble();

        int posicao = encontrarValor(vetor, valor);

        if (posicao != -1) {
            System.out.println("\nO valor " + valor + " foi encontrado!");
            System.out.println("Posição no vetor: " + posicao 
                                + " logo ele é o número de valor " + (posicao + 1) + " dentro do vetor!");
        } else {
            System.out.println("\nO valor " + valor + " não foi encontrado no vetor.");
        }

        sc.close();
    }

    public static double[] lerVetor(Scanner sc, int n) {
        double[] vetor = new double[n];

        System.out.println("\nDigite " + n + " valores reais:");
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }

        return vetor;
    }

    public static int encontrarValor(double[] vetor, double valor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
