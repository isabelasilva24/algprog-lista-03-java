import java.util.Scanner;
import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        int sorteado = rand.nextInt((maior - menor) + 1) + menor;

        System.out.println("Número sorteado: " + sorteado);

        if (sorteado % 2 == 0) {
            System.out.println("Número PAR");
        } else {
            System.out.println("Número ÍMPAR");
        }
    }
}