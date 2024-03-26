import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double number1,n1;
        double number2,n2;
        double media,result;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        n1 = scanner.nextInt();
        System.out.println("Digite a segunda nota:");
        n2 = scanner.nextInt();
        media=(n1+n2)/2;
        System.out.println("Sua media é:"+media);

        if (media<50){
                    System.out.println("Reprovado!");

        }   else {System.out.println("Aprovado!");}
        scanner.close();
    }
}