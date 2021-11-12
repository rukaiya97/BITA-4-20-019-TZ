import java.util.Scanner;
public class Revenue{
    public static void main(String[]args){
        Scanner out = new Scanner(System.in);
        System.out.println("Enter number of Participant :");
        int participant = out.nextInt();
        int reven = 2500 * participant;
        System.out.println("The revenue of the company that will generate for the tour is :"+reven);
        
    } 
}
