import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //initializers
        int amount;
        int i;
        int j;

        System.out.print("Enter number of items: ");
        amount = input.nextInt();  //sets the size of the array
    
        System.out.print("Enter number of items (seperated by space): ");
        int[] stars = new int[amount]; //creating the array 

        for (i = 0; i < amount; i++){
            stars[i] = input.nextInt();//inputs the numbers into the array
        }

        for (i=0; i< amount; i++){
            System.out.print(i+ ": "); //formatting
            for (j = 0; j < stars[i]; j++){
                System.out.print("*"); //puts a *, the amount depends on the value of the number in the array
            }
            System.out.println("(" + stars[i] + ")"); //for counting the amount of asterisks, this prints the value of the element in the array
        }
        input.close();
    }
}
