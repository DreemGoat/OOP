import java.util.Scanner;
import java.lang.Math;

public class Polynomial {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.println("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.println("Enter the value of c: ");
        double c = input.nextDouble();

        double x1 = (-b - Math.sqrt((b*b) - (4*a*c))/2*a);
        double x2 = (-b - Math.sqrt((b*b) - (4*a*c))/2*a);
        System.out.println("The value of x1 is: " + x1);
        System.out.println("The value of x2 is: " + x2);
        input.close();
    }
}
