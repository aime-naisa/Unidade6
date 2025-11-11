import java.util.Scanner;

public class exer07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N (1 a 20): ");
        int n = sc.nextInt();
       
        while (n < 1 || n > 20) {
            System.out.print("Valor inválido. Digite N entre 1 e 20: ");
            n = sc.nextInt();
        }

        int[] vetor = inserirSemRepetir(sc, n);
        ordenarBolha(vetor);
        imprimirVetor(vetor);

        sc.close();
    }

    public static int[] inserirSemRepetir(Scanner sc, int n) {
        int[] v = new int[n];
        int i = 0;

        while (i < n) {
            System.out.print("Digite um inteiro (" + (i + 1) + "/" + n + "): ");
            int valor = sc.nextInt();

            boolean existe = false;
       
            for (int j = 0; j < i; j++) {
                if (v[j] == valor) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                System.out.println("Valor já existente no vetor. Informe outro.");
            } else {
                v[i] = valor;
                i++;
            }
        }
       
        return v;
    }

    public static void ordenarBolha(int[] v) {
        boolean trocou = true;
        int fim = v.length - 1;

        while (trocou) {
            trocou = false;
       
            for (int i = 0; i < fim; i++) {
                if (v[i] > v[i + 1]) {
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    trocou = true;
                }
            }
       
            fim--;
        }
    }

    public static void imprimirVetor(int[] v) {
        System.out.print("\nVetor ordenado: [");
       
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) System.out.print(", ");
        }
       
        System.out.println("]");
    }
}
