import java.util.Scanner;

public class exer05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] rapaz = lerRespostas(sc, "rapaz");
        String[] moça  = lerRespostas(sc, "moça");

        sc.close();

        int afinidade = calcularAfinidade(rapaz, moça);
        exibirResultado(afinidade);
    }

    public static String[] lerRespostas(Scanner sc, String pessoa) {
        String[] respostas = new String[5];

        System.out.println("\nRespostas do " + pessoa + ":");

        System.out.print("1. Gosta de música sertaneja? (SIM / NÃO / IND): ");
        respostas[0] = normalizar(sc.next());

        System.out.print("2. Gosta de futebol? (SIM / NÃO / IND): ");
        respostas[1] = normalizar(sc.next());

        System.out.print("3. Gosta de seriados? (SIM / NÃO / IND): ");
        respostas[2] = normalizar(sc.next());

        System.out.print("4. Gosta de redes sociais? (SIM / NÃO / IND): ");
        respostas[3] = normalizar(sc.next());

        System.out.print("5. Gosta da Oktoberfest? (SIM / NÃO / IND): ");
        respostas[4] = normalizar(sc.next());

        return respostas;
    }

    private static String normalizar(String s) {
        s = s.toUpperCase();
        if (s.equals("NAO")) s = "NÃO";
        return s;
    }

    public static int calcularAfinidade(String[] r1, String[] r2) {
        int pontos = 0;

        for (int i = 0; i < r1.length; i++) {
            switch (r1[i] + "-" + r2[i]) {

                case "SIM-SIM":
                case "NÃO-NÃO":
                case "IND-IND":
                    pontos += 3;
                    break;

                case "IND-SIM":
                case "SIM-IND":
                case "IND-NÃO":
                case "NÃO-IND":
                    pontos += 1;
                    break;

                case "SIM-NÃO":
                case "NÃO-SIM":
                    pontos -= 2;
                    break;
            }
        }
        return pontos;
    }

    public static void exibirResultado(int afinidade) {
        System.out.println("\nÍndice de afinidade: " + afinidade);

        switch (afinidade) {

            case 15:
                System.out.println("Casem!");
                break;

            default:

                if (afinidade >= 10 && afinidade <= 14) {
                    System.out.println("Vocês têm muita coisa em comum!");
                }

                if (afinidade >= 5 && afinidade <= 9) {
                    System.out.println("Talvez não dê certo :(");
                }

                if (afinidade >= 0 && afinidade <= 4) {
                    System.out.println("Vale um encontro.");
                }

                if (afinidade >= -9 && afinidade <= -1) {
                    System.out.println("Melhor não perder tempo");
                }

                if (afinidade <= -10) {
                    System.out.println("Vocês se odeiam!");
                }

                break;
        }
    }
}
