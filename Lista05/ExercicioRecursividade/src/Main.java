import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercício 01");
        System.out.print("Digite um número: ");
        int numero1 = scanner.nextInt();
        exibirNumerosAte(numero1, 0);
        System.out.println("\n");

        System.out.println("Exercício 02");
        System.out.print("Digite um número: ");
        int numero2 = scanner.nextInt();
        System.out.println("O fatorial de " + numero2 + " é " + calcularFatorial(numero2));
        System.out.println("\n");

        System.out.println("Exercício 03");
        System.out.print("Digite o valor de X: ");
        int x = scanner.nextInt();
        System.out.print("Digite o valor de Y: ");
        int y = scanner.nextInt();
        System.out.println("O resultado é " + calcularPotencia(x, y));
        System.out.println("\n");

        System.out.println("Exercício 04");
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();
        if (verificarPalindromo(palavra))
            System.out.println(palavra + " é um palíndromo!");
        else
            System.out.println(palavra + " não é um palíndromo!");
    }

    public static void exibirNumerosAte(int n, int atual) {
        if (atual <= n) {
            System.out.println(atual);
            exibirNumerosAte(n, atual + 1);
        } else {
            System.out.println("Digite um número maior que 0");
        }
    }

    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * calcularFatorial(n - 1);
    }

    public static int calcularPotencia(int x, int y) {
        if (y == 0)
            return 1;
        else
            return x * calcularPotencia(x, y - 1);
    }

    public static boolean verificarPalindromo(String palavra) {
        if (palavra.length() <= 1)
            return true;
        else {
            char primeiro = palavra.charAt(0);
            char ultimo = palavra.charAt(palavra.length() - 1);
            if (primeiro == ultimo)
                return verificarPalindromo(palavra.substring(1, palavra.length() - 1));
            else
                return false;
        }
    }
}
