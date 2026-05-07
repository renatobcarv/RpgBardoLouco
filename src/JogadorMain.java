import java.util.Scanner;

public class JogadorMain {
    public static void main(String[] args) {

        //INPUTS
        Scanner input = new Scanner(System.in);
        Classes meuPersonagem = new Classes();

        // INICIAL
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║        RPG DO BARDO LOUCO         ║");
        System.out.println("╚════════════════════════════════════╝");
        System.out.println();
        System.out.println("Os ventos da guerra sopram no reino...");
        System.out.println("Escolha quem irá trilhar este destino.");
        System.out.println();

        //SELEÇÂO DE RAÇA
        System.out.println("Selecione:");
        System.out.println("1. Humano");
        System.out.println("2. Orc");
        meuPersonagem.escolhaClasse = input.nextInt();

        //LÓGICA BÁSICA DE SELEÇÃO
        input.nextLine(); // consome o ENTER que sobrou do nextInt()
        if (meuPersonagem.escolhaClasse == 1){
            meuPersonagem = new Classes.Humano();
        } else if (meuPersonagem.escolhaClasse == 2) {
            meuPersonagem = new Classes.Orc();
        }

        // SELEÇÃO DE NOME
        System.out.print("Qual seu nome, ó escolhido de Abadin? ");
        meuPersonagem.nome = input.nextLine();

        System.out.println();
        System.out.println("Muito bem, nobre guerreiro " + meuPersonagem.nome + ", da raça " + meuPersonagem + "!");

        //EXIBIÇÃO DA LORE
        String lore = """
        Os ventos rasgam o céu vindos do oeste...
        
        E trazem consigo o cheiro de fumaça e medo.
        
        Guerreiro... o reino sangra, e clama por você.
        
        Há vinte invernos, seu pai partiu rumo às ruínas de Alabart.
        Jamais retornou.
        
        Dizem que sua espada ainda repousa entre as pedras antigas,
        aguardando mãos dignas de empunhá-la novamente.
        
        Agora, criaturas despertam famintas nas sombras.
        Vilarejos ardem. Crianças desaparecem. Os anciões choram.
        
        Uma única profecia resta:
        
        "Quando o sangue do pai correr no filho,
        e a Pedra Divina reconhecer seu portador,
        o destino do reino será selado."
        
        E esse escolhido...
        
        é você.
        """;

        //LORE BASE
        System.out.println(lore);

        // COMEÇO DA JORNADA DO HEROI

        System.out.println("Muito bem...Sr, " + meuPersonagem.nome + ". Seu atributos são:");
        meuPersonagem.exibeFichaTecnica();


    }
}
