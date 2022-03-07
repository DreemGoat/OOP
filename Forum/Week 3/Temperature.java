import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Degrees Celcius: ");
        float X = input.nextFloat();

        float Y = ((X/5)*9)+32;
        System.out.println( X + " Degrees Celcius are " + Y + " Fahrenheit degrees");
        input.close();
    }
}
