import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o coeficiente A:");
        double A= in.nextDouble();
        System.out.println("Digite o coeficiente B:");
        double B= in.nextDouble();
        System.out.println("Digite o coeficiente C:");
        double C= in.nextDouble();
        double delta = B * B - 4 * A * C;

        if (delta > 0) {
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.println("As soluções da equação são:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -B / (2 * A);
            System.out.println("A equação tem uma raiz dupla:");
            System.out.println("x = " + x);
        } else {
            System.out.println("A equação não possui raízes reais!");
        }
    }
}