import java.util.Scanner;
public class letters{
    public static void main(String[]args) {
        Scanner ruky = new Scanner(System.in);
        System.out.println("Please Enter the First Number : ");
        int first_number = ruky.nextInt();
        System.out.println("Please Enter the Second Number : ");
        int second_number = ruky.nextInt();
        int HCF,LCM, x,y,z;
        x = first_number;
        y = second_number;
        while(y != 0){
            z = y;
            y = x%y;
            x = z;
        }
        HCF = x;
        LCM =(first_number * second_number)/HCF;
        System.out.println("The HCF of the input number is : "+HCF);
        System.out.println("The LCM of the input number is : "+LCM);
        
    }
}