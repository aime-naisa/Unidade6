import java.util.Scanner;

public class exer03 {

    public static void main(String[] args) {
        double[] vetor = lerValores();
        
        ajustarValores(vetor);
        imprimirVetor(vetor);
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

    public static void ajustarValores(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = vetor[i] * (1 + 0.02);
            } else {
                vetor[i] = vetor[i] * (1 + 0.05);
            }
        }
    }

    public static void imprimirVetor(double[] vetor) {
        System.out.println("\nVetor após os ajustes:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d", i);
            System.out.printf(" -> %.2f%n" , vetor[i]);
        }
    }
}





