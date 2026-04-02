import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.141592;

        System.out.print("Digite a operação (1, 2 ou 3): ");
        int op = sc.nextInt();

        System.out.print("Digite o raio: ");
        double r = sc.nextDouble();

        switch (op) {
            case 1:
                double perimetro = 2 * PI * r;
                System.out.println("Perímetro: " + perimetro);
                break;

            case 2:
                double area = PI * r * r;
                System.out.println("Área: " + area);
                break;

            case 3:
                double volume = (4.0 / 3.0) * PI * Math.pow(r, 3);
                System.out.println("Volume: " + volume);
                break;

            default:
                System.out.println("Código inválido!");
        }
    }
}