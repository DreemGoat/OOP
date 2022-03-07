import java.util.Scanner;
import java.lang.Math;

public class Statistical_Parameters {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first variable: ");
        double x1 = input.nextDouble();

        System.out.println("Enter the second variable: ");
        double x2 = input.nextDouble();

        System.out.println("Enter the third variable: ");
        double x3 = input.nextDouble();
        
        double μ = (x1+x2+x3)/3;
        double n1 = (x1 - μ);
        double n2 = (x2 - μ);
        double n3 = (x3 - μ);
        double σ2 =  ((n1*n1) + (n2*n2) + (n3*n3))/3;
        double σ = Math.sqrt(σ2);

        System.out.println("The mean is: " + μ);
        System.out.println("The variance is: " + σ2);
        System.out.println("The Standard Deviation is: " + σ);
        input.close();
    }
}
