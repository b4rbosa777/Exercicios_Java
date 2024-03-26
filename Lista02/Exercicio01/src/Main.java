import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double number,raiz;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero real:");
        number = scanner.nextInt();
        raiz = Math.sqrt(number);
        if (number>0){
            System.out.println("O numero desse valor é " + raiz);
        }
        else {
            System.out.println("Valor Invalido");

        }
        scanner.close();}
}