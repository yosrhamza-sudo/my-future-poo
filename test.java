import java.util.Scanner;
public class test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un nombre");
        double nombreApp1 = scanner.nextDouble();
        double doubleNombre = nombreApp1 * 2;
        System.out.println("le double de"+ nombreApp1+ "est:"+ doubleNombre);
        System.out.println();
    }   
}