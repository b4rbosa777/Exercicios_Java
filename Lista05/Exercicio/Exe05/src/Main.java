import java.util.Scanner;
public class Main {
    public static int buscabin(int n1, int [] array) {
        int comeco = 0;
        int fim = array.length-1;

        while (comeco <= fim) {
            int meio = (comeco + fim) /2;
            if (array[meio] == n1) {
                return meio;
            }

            if (n1 < array[meio]) {
                fim = meio - 1;
            }
            else {
                comeco = meio + 1;
            }

        }



        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] array = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Digite um número: ");
        int n1 = in.nextInt();
        int resultado = buscabin(n1, array);
        if (resultado == -1) {
            System.out.println("Valor nao encontrado! ");
        }
        else {
            System.out.println("Valor encontrado! Na posicao " + resultado);
        }


    }
}