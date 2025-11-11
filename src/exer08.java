import java.util.Scanner;

public class exer08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N (máximo 20): ");
        int n = sc.nextInt();

        while (n < 1 || n > 20) {
            System.out.print("Valor inválido. Digite um número entre 1 e 20: ");
            n = sc.nextInt();
        }

        double[] vetor = new double[n];

        System.out.println("\nDigite " + n + " valores reais:");
        for (int i = 0; i < n; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println("\nVALOR\tFREQUÊNCIA");
        calcularFrequencia(vetor);

        sc.close();
    }

    public static void calcularFrequencia(double[] vetor) {
        boolean[] contado = new boolean[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            if (!contado[i]) {
                int cont = 1;

                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        cont++;
                        contado[j] = true;
                    }
                }

                System.out.printf("%.2f\t%d%n", vetor[i], cont);
            }
        }
    }
}
