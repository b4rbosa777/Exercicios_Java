import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println( " Digite nota 1: ");
        double number1 = in.nextInt();
        System.out.println( "Digite nota 2: ");
        double number2 = (double) in.nextInt();
        double media = (number1 + number2) / 2;
        System.out.println(" A sua média é: " + media);

    }
}