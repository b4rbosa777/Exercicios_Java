import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println( "Digite a polegada: ");
        double number1= in.nextInt();
        double milimetro = (number1) * 25.4;
        System.out.println(" Em milímetros fica:" + milimetro);
    }
}