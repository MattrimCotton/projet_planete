import java.util.Scanner;

public class c5e8 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int nbr1 = 1;
        int nbr2 = 2;
        int random = ChoiceRandom(nbr1, nbr2);

        String Name = AskInformation("Bonjour, Entrez votre nom qui sera utilisé dans le jeu.");
        EnterGame(Name);

    }

    public static String AskInformation(String _question) {
        System.out.println(_question);
        return input.nextLine();

    }

    public static boolean EnterGame(String _name) {
        System.out.println("Bienvenu " + _name
                + "présentation du jeu \nVoulez-vous jouer ?\nEntrer [o] pour jouer, sinon appuyer sur n'importe quelle touche pour sortir du jeu");
        if (input.nextLine().equals("o")) {
            System.out.println("C'est parti.");
            return true;
        } else {
            System.out.println("Au revoir.");
            return false;
        }
    }

    public static int ChoiceRandom(int _nbr1, int _nbr2) {
        int random = (int) (Math.random() * (_nbr2 - _nbr1) + _nbr1);
        return random;
    }

    public voidPlanete() {
        int qestionNumber=0;
        int erreur=0 ;
if (erreur<3) {
System.out.println("Vous avez échoué.");
Planete();
}
        do {
 erreur++;           
        } while (qestionNumber!=5);
    }

    public void Question(int random) {
        String [ChoiceRandom(0, questions.length ) ] questions={"question1","question2","question3"};
        System.out.println(questions[0]);
        System.out.println(questions.length);

    }

}