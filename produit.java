import java.util.Scanner;
import java.util.stream.Gatherer;
public class produit {
    Scanner scanner = new Scanner(System.in);

    String reference;
    String designation;
    double prix;
    int quantite;

    public produit(String reference, String designation, double prix, int quantite){
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
    }
    public double getPrix() {
        return prix;
    }

    public void setPrixHT(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite= quantite;
    }
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void saisirProduit() {

        System.out.println("Donner la reference: ");
        reference = scanner.nextLine();

        System.out.println("Donner la designation: ");
        designation = scanner.nextLine();

        System.out.println("Donner le prix: ");
        prix = scanner.nextDouble();

        System.out.println("Donner la quantite: ");
        quantite = scanner.nextInt();
    }
    public void afficherProduit() {

        System.out.println("Reference: " + reference);
        System.out.println("Designation: " + designation);
        System.out.println("Prix: " + prix);
        System.out.println("Quantite: " + quantite);
    }
    public void appliqueRemise(){
        System.out.println("Donner le pourcentage de remise : ");
        double pourcentage= scanner.nextDouble();
        double nvPrix = prix * (1 - pourcentage / 100);
        System.out.println("Prix apres remise : " + nvPrix);

    }
    public void calculer(){

        double valeur = prix* quantite;
        System.out.println("Valeur du stock : " + valeur);
    }
    public static void main(String[] args) {

        produit p1 = new produit("ref2", "souris", 15000, 5);
    
        int choix;
    
        do {
            
            System.out.print("Votre choix: ");
            choix = p1.scanner.nextInt();
    
            switch (choix) {
    
                case 1:
                    p1.afficherProduit();
                    break;
    
                case 2:
                    p1.saisirProduit();
                    break;
    
                case 3:
                    System.out.println("Nouvelle designation : ");
                    p1.scanner.nextLine(); 
                    String nom = p1.scanner.nextLine();
                    p1.setDesignation(nom);
                    p1.afficherProduit();
                    break;
    
                case 4:
                    p1.appliqueRemise();
                    break;
                case 5:
                    p1.calculer();
                    break;
    
                default:
                    System.out.println("Choix invalide");
            }
    
        } while (choix != 4);
    
        p1.scanner.close();
    }
    }

