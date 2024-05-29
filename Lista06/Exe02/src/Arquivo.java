public class Arquivo {
    private String nome;
    private String conteudo;
    private int tamanho;

    //Construtor
    public Arquivo(String nome) {
        this.nome = nome;
        this.conteudo = "";
        this.tamanho = 0;
    }

    //Métodos

    public void abrir() {
        System.out.println("Abrindo o arquivo: " + this.nome);
        System.out.println("Conteúdo: " + this.conteudo);
        System.out.println("Tamanho: " + this.tamanho + " bits");
    }


    public void editar(String novoConteudo) {
        this.conteudo += novoConteudo;
        this.tamanho = this.conteudo.length() * 8;
    }


    public void renomear(String novoNome) {
        this.nome = novoNome;
    }
    public void limpar() {
        this.conteudo = "";
        this.tamanho = 0;
    }
}

