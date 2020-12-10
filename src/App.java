import java.sql.Date;
import java.util.Scanner;

public class App {


    public static Film addFilm() {
        System.out.println("###AJOUTER UN FILM###\n");
        Scanner add = new Scanner(System.in);
        System.out.println("Le nom du film: ");
        String Nom = add.nextLine();
        System.out.println("L'acteur principal: ");
        String Acteur = add.nextLine();
        System.out.println("Le realisateur: ");
        String Realisateur = add.nextLine();
        System.out.println("Le support: "); //Maybe add a way to choose according to set choices through numbers
        String Support = add.nextLine();
        System.out.println("La date de sortie (AAAA): ");
        String DateSortie = add.nextLine();
        Film addedFilm = new Film(Nom, Acteur, Realisateur, Support, DateSortie);

        add.close();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("###SYSTEME DE GESTION DE FILMS###");
        System.out.println("\'1\' - Ajouter un film\n\'2\' - Recherche film\n\'3\' - Films disponibles/loués\n\'4\' - Films par support\n\'5\' - Supprimer un film\n\'6\' - Ajouter un client\n\'7\' - Affecter des films\n\'8\' - Afficher films loués\n");
        String input = sc.nextLine();
        switch(input) {
            case "1":
                Film addedFilm = Film();
                break;
            default:
                System.out.println("Work in progress");
        }
        sc.close();
    }
}
