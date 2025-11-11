import java.util.Scanner;

public class exer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] dados = lerMatriz(sc, 10);
        double mediaGeral = mediaGN(dados);
        double mediaH = mediaH(dados);
        Integer notaMJ = notaMMJ(dados);
        int qtdM50 = contM50(dados, mediaGeral);

        System.out.printf("\nNota média do cinema: %.2f%n", mediaGeral);

        if(Double.isNaN(mediaH)) {
            System.out.println("Não há homens na amostra!");
        } else {
            System.out.printf("Nota da média atribuida pelos homens: %.2f%n", mediaH);
        }

        if (notaMJ == null) {
            System.out.println("Não há mulheres na amostra!");
        } else {
            System.out.printf("Nota atribuida pela mulher mais jovem do cinema: " + notaMJ);
        }

        System.out.println("\nMulheres com mais de 50 anos que avaliaram com notas acima da média: " + qtdM50);

        sc.close();
    }

    public static int[][] lerMatriz(Scanner sc, int n) {
        int[][] matriz = new int[n][3];

        for (int i = 0; i < n; i++) {
            System.out.println("\nCliente " + (i + 1) + ":");

            System.out.print("Sexo (1 - Feminino | 2 - Masculino): ");
            matriz[i][0] = sc.nextInt();

            System.out.print("Nota (0 a 10): ");
            matriz[i][1] = sc.nextInt();

            System.out.print("Sua Idade: ");
            matriz[i][2] = sc.nextInt();

        } 
        
        return matriz;
    }

    public static double mediaGN(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][1];
        }

        return (double) soma / matriz.length;
    }

    public static double mediaH (int[][] matriz) {
        int somaH = 0;
        int contH = 0;

        for (int i = 0; i <matriz.length; i++) {
            switch (matriz[i][0]) {
                case 2:
                    somaH += matriz[i][1];
                    contH++;
                    break;
                default:
                    break;
            }
        }

        return contH == 0 ? Double.NaN : (double) somaH / contH;
    }

    public static Integer notaMMJ(int[][] matriz) {
        Integer menorIdade = null;
        Integer nota = null;

        for (int i = 0; i <matriz.length; i++){
            switch (matriz[i][0]) {
                case 1:
                    if (menorIdade == null || matriz[i][2] < menorIdade) {
                        menorIdade = matriz[i][2];
                        nota = matriz[i][1];
                    }
                    break;
                default:
                    break;
            }
        }

        return nota;
    }

    public static int contM50(int[][] matriz, double media) {
        int qtde = 0;

        for (int i = 0; i < matriz.length; i++){
            switch (matriz[i][0]) {
                case 1:
                    if (matriz[i][2] > 50 && matriz[i][1] > media) {
                        qtde++;
                    }
                    break;
                default:
                    break;
            }
        }
        return qtde;
    }
}
