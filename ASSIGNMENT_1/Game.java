import java.util.Scanner;
public class Game{
    public static void main(String[]args) {
        Scanner ball = new Scanner(System.in);
        System.out.println("Enter your name Please :");
        String name = ball.nextLine();
        System.out.println("Enter your Age  :");
        int age = ball.nextInt();
        System.out.println("Enter your City :");
        String city = ball.nextLine();
        System.out.println("Enter your collage name:");
        String collage = ball.nextLine();
        System.out.println("Enter your profession:");
        String profession = ball.nextLine();
        System.out.println("Enter your Animal name:");
        String Animal = ball.nextLine();
        System.out.println("Enter your Pet's name:");
        String pet = ball.nextLine();
    System.out.println("There once was a person named "+name+"who lived in "+city+".At the age of "+age+"."+name+" went to the collage at "+collage+"."+name+" graduated and went to work as a "+profession+" Then, "+name+" adopted a "+Animal+" named "+pet+" They both lived happily ever after!");        
        
    }
}