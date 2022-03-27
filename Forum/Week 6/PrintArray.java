import java.util.Scanner;

public class PrintArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //initializers
        int amount;
        int i;
 

        System.out.print("Enter the number of items: ");
        amount = input.nextInt(); //sets the size of the array

        System.out.print("Enter the values of all items (seperated by space): ");
        int[] numbers = new int[amount]; //creating the array

        for (i = 0; i <amount;i++){
            numbers[i] = input.nextInt(); //inputs numbers into the array
        }
        System.out.print("The values are: [");

        for (i = 0 ; i < amount; i++){
            System.out.print(numbers[i]);//prints out the numbers of the array one by one
            if (i != amount -1) {//formatting
                System.out.print(", ");
            }
        }
        System.out.print("]");
        input.close();
    }
}