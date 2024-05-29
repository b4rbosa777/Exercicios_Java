public class Main {
    public static void main(String[] args) {

        Arquivo arquivo = new Arquivo("estudos.txt");


        arquivo.abrir();


        arquivo.editar("java.estudos.txt");
        arquivo.abrir();


        arquivo.renomear("novo_estudo_arquivo.txt");
        arquivo.abrir();


        arquivo.limpar();
        arquivo.abrir();
    }
}
