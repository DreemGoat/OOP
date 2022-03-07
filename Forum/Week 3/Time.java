import java.util.Scanner;

public class Time {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Input the time in seconds: ");
        int s = input.nextInt();

        int hourCount = s/3600;
        int minCount = (s%3600)/60;
        int remainSec = ((s%3600)/60)%60;
        System.out.println(s + " seconds are " + hourCount +" hour(s)," + minCount + " minute(s), and " + remainSec + " second(s).");
        input.close();
    }
}
