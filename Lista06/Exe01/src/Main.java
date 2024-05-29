public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria(1,"Caina Antunes Silva");
        if (c1.depositar(100))
            System.out.println("Deposito realizado com sucesso");
        else
            System.out.println("Valor Invalido");

        System.out.println(c1.getSaldo());

        if (c1.sacar(13.40))
            System.out.println("Saque realizado");
        else
            System.out.println("Valor nao disponivel");

        System.out.println(c1.getSaldo());

        System.out.println(c1.toString());
    }
}