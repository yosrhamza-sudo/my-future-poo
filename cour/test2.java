import java.util.Scanner;
public class test2 {

    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("saisir un nombre");
        int nb1=scanner.nextInt();
        System.out.println("saisir un nombre");
        int nb2=scanner.nextInt();
        if(nb1>nb2){
            System.out.println(nb1 + ">" + nb2);
        }
        else if(nb1<nb2){
            System.out.println(nb1 + "<" + nb2);

        }  
        else{
            System.out.println(nb1 + "=" + nb2);
        } 
     }

}