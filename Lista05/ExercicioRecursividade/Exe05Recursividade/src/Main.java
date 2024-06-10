import java.util.Scanner;

public class Main {
    public static int buscabinRecursivo(int n1, int[] array, int comeco, int fim) {
        if (comeco > fim)
            return -1;

        int meio = (comeco + fim) / 2;

        if (array[meio] == n1)
            return meio;

        if (n1 < array[meio])
            return buscabinRecursivo(n1, array, comeco, meio - 1);
        else
            return buscabinRecursivo(n1, array, meio + 1, fim);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Digite um número: ");
        int n1 = in.nextInt();
        int resultado = buscabinRecursivo(n1, array, 0, array.length - 1);
        if (resultado == -1) {
            System.out.println("Valor não encontrado! ");
        } else {
            System.out.println("Valor encontrado! Na posição " + resultado);
        }
    }
}
