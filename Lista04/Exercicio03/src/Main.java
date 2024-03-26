import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        boolean found = false;
        int value;
        Scanner in =new Scanner(System.in);
        System.out.println("Digite um valor:");
        value = in.nextInt();

        for (int i=0;i<vector.length;i++){
            if (vector [i]==value){
                System.out.println("Valor " + value +  " encontrado na posição " + i);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Valor não encontrado");


    }
}