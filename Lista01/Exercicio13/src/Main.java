import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o raio:");
        double number1= in.nextInt();
        double resultado= Math.PI * (number1*number1);
        System.out.println("A area é:" + resultado);
    }
}