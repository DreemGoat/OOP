import java.util.Scanner;

public class Grades {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //initializers
        int amount;
        int i;
        double total = 0;
        double average;

        System.out.print("Enter the number of students: ");
        amount = input.nextInt(); //sets the size of the array
        int[] grades = new int[amount]; //creating the array

        for (i=0; i<amount; i++){
            System.out.print("Enter the grade for student " + (i+1) + ": ");
            grades[i] = input.nextInt(); //putting the values into the array
        }

        int min = grades [0]; 
        int max = grades [0]; //the min and max will be set to the first value of the first element in the array
        for (i=0; i<amount; i++){
            total = total + grades[i]; //adds all the values of the elements
            if(grades[i]>max){  //if the value of the element in the place of i is bigger than the value of the first element in the array, then it is the maximum
                max = grades[i]; //however if there is more that are bigger than the first value, then it will take the highest one
            }
            if(grades[i]<min) { //if the value of the element in the place of i is bigger than the value of the first element in the array, then it is the minimum
                min = grades[i]; //however if there is more that are bigger than the first value, then it will take the highest one
            }
        }

        average = total/grades.length;
        System.out.printf("The average is %.2f\n", average);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
        input.close();
    }
}
