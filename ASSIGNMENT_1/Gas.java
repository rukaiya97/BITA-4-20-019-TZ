import java.util.Scanner;
public class Gas {
    public static void main(String [] args){
       Scanner py = new Scanner(System.in);
       System.out.println("Enter number of Gallon:");
       int gallons = py.nextInt();
       System.out.println("Enter number of miles per gallon:");
       double speed = py.nextDouble();
       System.out.println("Enter price of gas per gallon:");
       double price = py.nextDouble();
       double totalGallons = 250/speed;
       double cost = totalGallons * price;
       System.out.println("The cost per 250 miles: TZS "+cost);
       double distance = gallons * speed;
       System.out.println("Total distance car can travel is: "+distance + " miles");

    }
}