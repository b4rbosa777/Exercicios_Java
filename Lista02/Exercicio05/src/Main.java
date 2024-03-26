import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a sua média:");
        double m1= in.nextDouble();
        if (m1>=8.5){
            System.out.println("O conceito da sua média é A");
        } else if (m1>7 && m1<8.5) {
            System.out.println("O conceito da sua nota é B");
        } else if (m1>=5 && m1<7) {
            System.out.println("O conceito da sua nota é C");
        } else if (m1<5) {
            System.out.println("O conceito da sua média é D");

        }


    }


}