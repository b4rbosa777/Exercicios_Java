import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double number1,n1;
        double number2,n2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        n2 = scanner.nextInt();

        if (n1>n2){
            System.out.println("O primeiro numero é maior!");
        }else System.out.println("O segundo numero é maior!");
    scanner.close();
}
}