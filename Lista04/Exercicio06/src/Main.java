public class Main {
    public static void main(String[] args) {
        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        int aux;

        for (int n : vector){
            System.out.print(n + " ");
        }
        for (int i=0;i< vector.length/2;i++){
            aux=vector[i];
            vector[i]=vector[(vector.length-1)-i];
            vector[(vector.length-1)-i]=aux;

        }
        System.out.println();
        for (int n: vector) {
            System.out.print(n + " ");
        }
    }
}
