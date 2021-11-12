import java.util.Scanner;
public class Emplee{
    public static void main(String[]args){
        Scanner ruky = new Scanner(System.in);
        System.out.println("Please Enter Performance Level:");
        double performance = ruky.nextDouble();
        System.out.println("Please Enter Base Salary:");
        double Base = ruky.nextDouble();
        double bonus = 0.03 * Base;
        double salary = bonus + Base;
        if (performance >=90){
            System.out.println("The Salary is "+salary);
        }
        else{
            System.out.println("The salary is "+salary);
        }
    }

}
