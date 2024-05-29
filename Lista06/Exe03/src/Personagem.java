import java.util.Random;

public class Personagem {
    //Atributos

    private String Personagem;

    private int vida = 100;

    private int ataque;

    private int defesa;

    private String nome;

    Random random =new Random();
    //Construtor

    public Personagem(String nome) {

        this.nome=nome;
        this.ataque = random.nextInt(11)+20;
        this.defesa = random.nextInt(6)+10;
    }



    //Metodos

    public void Atacar(Personagem personagem) {
        int dano = this.ataque - personagem.defesa;
        if (dano > 0) {
            personagem.vida -= dano;
            if (personagem.vida <= 0) {
                System.out.println(personagem.nome + " morreu. Fim do jogo.");
                System.exit(0); // Encerra o programa

            }
        }
    }



    //getters and setter

    public String getPersonagem() {
        return Personagem;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public String toString() {
        return "ComandosJogo{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defesa=" + defesa +

                '}';
    }
}
