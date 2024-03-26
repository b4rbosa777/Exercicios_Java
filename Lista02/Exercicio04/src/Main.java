import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        double n1 = in.nextDouble();
        System.out.println("Digite a segunda nota:");
        double n2 = in.nextDouble();
        double média = (n1 + n2) / 2;
        if (média >= 50) {
            System.out.println("Aprovado");
        } else if (média < 50) {
            System.out.println("Reprovado");
            System.out.println("Nota da recuperação:");
            double rec = in.nextDouble();
            double média2 = (média + rec) / 2;
            if (média2 > 50) {
                System.out.println("Aprovado");
            }
            if (média2 < 50) {
                System.out.println("Reprovado!!");
            }


        }
    }
}