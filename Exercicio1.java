import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = sc.nextDouble();

        double maior = Math.max(n1, Math.max(n2, n3));
        double menor = Math.min(n1, Math.min(n2, n3));
        double media = (n1 + n2 + n3) / 3;

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);
    }
}