import java.util.Scanner;

public class tp3 {
    String nom;
    String code;
    String classe;

    public void afficherEtudiant() {
        System.out.println("Nom: " + nom);
        System.out.println("Code: " + code);
        System.out.println("Classe: " + classe);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nom E");
        String nom = scanner.nextLine();
        System.out.println("code E");
        String code = scanner.nextLine();
        System.out.println("classe E");
        String classe = scanner.nextLine();

        int choix;
do {
    System.out.println("afficher les details d'un etudiant");
    System.out.println("afficher le code E et la classe");
    System.out.println("quitter");
    System.out.print("votre choix : ");
    choix = scanner.nextInt();

    switch (choix) {
        case 1:
            System.out.println("Nom : " + nom);
            System.out.println("Code : " + code);
            System.out.println("Classe : " + classe);
            break;
    
        case 2:
            System.out.println("Code : " + code);
            System.out.println("Classe : " + classe);
            break;
    
        case 3:
            System.out.println("Au revoir");
            break;
    
        default:
            System.out.println("Choix invalide");
    }
} while (choix != 3);

scanner.close();
}
}

