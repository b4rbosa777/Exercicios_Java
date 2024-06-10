import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercicio01();
        System.out.println("\n");
        Exercicio02();
        System.out.println("\n");
        Exercicio03();
        System.out.println("\n");
        Exercicio04();


    }

    public static void Exercicio01 (){
        Scanner in = new Scanner(System.in);

        System.out.println("Exe01 " + "Digite um numero:");
        int n = in.nextInt();
        if (n>0) {
            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }
        }else System.out.println("Digite um numero maior que 0");
    }

    public static void Exercicio02 (){
    Scanner in = new Scanner(System.in);
        System.out.println("Exe02 " + "Digite um numero:");
        int n = in.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é " + fatorial);
    }

    public static void Exercicio03 (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Exe03 " + "Digite o valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de Y : ");
        int y = scanner.nextInt();

        if (y >=0 ) {
            int resultado = 1;

            if (y != 0) {
                for (int i = 1; i <= y; i++) {
                    resultado *= x;
                }

        } else {
            System.out.println("O valor de Y deve ser maior ou igual a zero.");
        }
            System.out.println("O resultado é "+ resultado);
        }


    }
    public static void Exercicio04 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exe04 " + "Digite uma palavra: ");
        String s1 = scanner.nextLine();
        char inverso = 0;
        char aux = 0;
        for (int j = 0; j < s1.length(); j++) {
            aux = s1.charAt(j);
        }
        for (int i = s1.length() -1; i >= 0; i--) {
            inverso = s1.charAt(i);
            System.out.print( inverso );

        }
        if (aux != inverso) {
            System.out.println(" não é um palíndromo! ");
        }

        else {
            System.out.println("  é um palíndromo! ");
        }

    }

}
