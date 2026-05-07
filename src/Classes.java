public class Classes {

    // ATRIBUTOS
    int escolhaClasse;
    String escolhaRaca;
    String nome;
    int dano;
    int vida;
    int armadura;

    // MÉTODOS
    @Override
    public String toString() {
        return escolhaRaca;
    }

    void exibeFichaTecnica() {
        System.out.println("Raça: " + escolhaRaca);
        System.out.println("Dano: " + dano);
        System.out.println("Vida: " + vida);
        System.out.println("Armadura: " + armadura);
        System.out.println("Nome: " + nome);
    }

    public static class Humano extends Classes {
        public Humano() {
            escolhaRaca = "Humano";
            dano = 15;
            vida = 100;
            armadura = 5;
        }
    }

    public static class Orc extends Classes {
        public Orc() {
            escolhaRaca = "Orc";
            dano = 20;
            vida = 150;
            armadura = 10;
        }
    }
}