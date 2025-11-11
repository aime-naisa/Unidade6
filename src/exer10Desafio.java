import java.util.Scanner;

public class exer10Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] vetor = new int[50];
        int tamanho = 0;
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> tamanho = incluirValor(sc, vetor, tamanho);
                case 2 -> pesquisarValor(sc, vetor, tamanho);
                case 3 -> alterarValor(sc, vetor, tamanho);
                case 4 -> tamanho = excluirValor(sc, vetor, tamanho);
                case 5 -> mostrarValores(vetor, tamanho);
                case 6 -> ordenarValores(vetor, tamanho);
                case 7 -> inverterValores(vetor, tamanho);
                case 8 -> System.out.println("\nSaindo do sistema..." + "\nVocê saiu do Sistema!");
                default -> System.out.println("\nOpção inválida!");
            }
        } while (opcao != 8);

        sc.close();
    }

    public static int incluirValor(Scanner sc, int[] vetor, int tamanho) {
        if (tamanho < vetor.length) {
            System.out.print("\nDigite o valor a ser incluído: ");
            int valor = sc.nextInt();
        
            vetor[tamanho] = valor;
        
            tamanho++;
        
            System.out.println("Valor incluído com sucesso!");
        } else {
            System.out.println("Vetor cheio!");
        }
        
        return tamanho;
    }

    public static void pesquisarValor(Scanner sc, int[] vetor, int tamanho) {
        System.out.print("\nDigite o valor a ser pesquisado: ");
        int valor = sc.nextInt();
        
        boolean encontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                System.out.println("Valor encontrado na posição " + i);
        
                encontrado = true;
        
                break;
            }
        }
        if (!encontrado) System.out.println("Valor não encontrado.");
    }

    public static void alterarValor(Scanner sc, int[] vetor, int tamanho) {
        System.out.print("\nDigite o valor a ser alterado: ");
        int antigo = sc.nextInt();
        
        boolean encontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == antigo) {
                System.out.print("Digite o novo valor: ");
                int novo = sc.nextInt();
        
                vetor[i] = novo;
        
                System.out.println("Valor alterado com sucesso!");
        
                encontrado = true;
        
                break;
            }
        }
        if (!encontrado) System.out.println("Valor não encontrado.");
    }

    public static int excluirValor(Scanner sc, int[] vetor, int tamanho) {
        System.out.print("\nDigite o valor a ser excluído: ");
        int valor = sc.nextInt();
        
        boolean encontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                for (int j = i; j < tamanho - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
        
                tamanho--;
        
                System.out.println("Valor excluído com sucesso!");
        
                encontrado = true;
        
                break;
            }
        }
        if (!encontrado) System.out.println("Valor não encontrado.");
        return tamanho;
    }

    public static void mostrarValores(int[] vetor, int tamanho) {
        if (tamanho == 0) {
            System.out.println("\nVetor vazio.");
        } else {
            System.out.print("\nValores no vetor: ");
            for (int i = 0; i < tamanho; i++) {
                System.out.print(vetor[i] + " ");
            }
        
            System.out.println();
        }
    }

    public static void ordenarValores(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        System.out.println("\nValores ordenados em ordem crescente!");
    }

    public static void inverterValores(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }
        System.out.println("\nValores invertidos com sucesso!");
    }
}
