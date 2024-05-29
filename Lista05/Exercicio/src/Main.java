import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercicio03();

    }

    public static void Exercicio01 (){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n = in.nextInt();
        if (n>0) {
            for (int i = 0; i <= n; i++) {
                System.out.println(i);
            }
        }else System.out.println("Digite um numero maior que 0");
    }

    public static void Exercicio02 (){
    Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = in.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é " + fatorial);
    }

    public static void Exercicio03 (){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero");
        int numero = in.nextInt();
        System.out.println("Digite qual o numero sera a potencia");
        int potencia = in.nextInt();
        int resultado=0;

        if (potencia>numero){
            for (int i=potencia;i>0;i--){
                resultado+=numero*;
            }
        }
    }
    public static void Exercicio04 (){

    }
    public static void Exercicio05 (){

    }
}