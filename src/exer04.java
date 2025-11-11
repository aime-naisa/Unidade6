import java.util.Scanner;

public class exer04 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] vetor1 = lerVetor(sc, "primeiro");
            int[] vetor2 = lerVetor(sc, "segundo");
            int[] vetor3 = somarVetores(vetor1, vetor2);

            escreverVetores(vetor1, vetor2, vetor3);
        }
    }

    public static int[] lerVetor(Scanner sc, String nome) {
        int[] vetor = new int[10];
        
        System.out.println("\nDigite os valores do " + nome + " vetor:");
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }
        
        return vetor;
    }

    public static int[] somarVetores(int[] v1, int[] v2) {
        int[] soma = new int[10];
        for (int i = 0; i < soma.length; i++) {
            soma[i] = v1[i] + v2[i];
        }
        
        return soma;
    }

    public static void escreverVetores(int[] v1, int[] v2, int[] v3) {
        System.out.println("\nVetor 1:");
        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }

        System.out.println("\n\nVetor 2:");
        for (int i = 0; i < v2.length; i++) {
            System.out.print(v2[i] + " ");
        }

        System.out.println("\n\nVetor 3 (soma):");
        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " ");
        }

        System.out.println();
    }
}
