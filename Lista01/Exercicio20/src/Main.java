import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a raiz x1:");
        double x1 = scanner.nextDouble();

        System.out.println("Digite a raiz x2:");
        double x2 = scanner.nextDouble();

        double b = -1 * (x1 + x2);
        double c = x1 * x2;

        System.out.println("A equação do segundo grau correspondente é:");
        System.out.println("x^2 + (" + b + ")x + (" + c + ") = 0");

        scanner.close();
    }
}