public class Main {
    public static void main(String[] args) {
        Personagem p1 = new Personagem("jogador1");
        Personagem p2 = new Personagem("jogador2");


        p1.Atacar(p2);
        p2.Atacar(p1);
        p1.Atacar(p2);
        p2.Atacar(p1);
        p1.Atacar(p2);
        p2.Atacar(p1);
        p1.Atacar(p2);
        p2.Atacar(p1);
        p1.Atacar(p2);
        p2.Atacar(p1);
        p1.Atacar(p2);
        p2.Atacar(p1);
        p1.Atacar(p2);

        System.out.println(p1);
        System.out.println(p2);

    }
}