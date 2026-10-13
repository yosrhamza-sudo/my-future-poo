public class MainApp {

    public static void main(String[] args) {

      
        Client c1 = new Client("07123456", "Ben Salah", "Sonia", "98765432");
        Client c2 = new Client("09876543", "Kacem", "Ahmed", "50112233");

      
        compteBancaire compte1 = new compteBancaire("CB-1001", 500.0, c1);
        compteBancaire compte2 = new compteBancaire("CB-1002", 1500.0, c2);

        
        compte1.afficherDetails();
        compte2.afficherDetails();

        
        compte1.deposer(200.0); 
        compte1.retirer(1000.0); 
        compte1.retirer(300.0);

     
        compte2.virement(compte1, 500.0); 

        
        compte1.afficherDetails();
        compte2.afficherDetails();

        System.out.println("\nNombre total de comptes crees : " + compteBancaire.getNombreComptes());
    }
}
