import java.util.Scanner;
public class Years_days{
    public static void main(String[]args){
        Scanner asha = new Scanner(System.in);
        System.out.println("Please enter the minutes :");
        int min = asha.nextInt();
        int x = 60;
        int y = x * 24;
        int z = y * 365;
        int years = min/z;
        int days = (min % z) / y;
        System.out.println("%y minutes is approximately %y years and % y days. " + min + years+days+"");
    }
}