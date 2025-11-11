import java.util.Scanner;

public class exer01 {

    public static void main(String[] args) {
        int[] vetor = lerNumeros();
        
        escreverInverso(vetor);
    }

    public static int[] lerNumeros() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        sc.close();
        return numeros;
    }

    public static void escreverInverso(int[] vetor) {
        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
