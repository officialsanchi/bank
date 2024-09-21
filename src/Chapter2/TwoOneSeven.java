package Chapter2;
import java.util.Scanner;

public class TwoOneSeven {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first integer :");
        int first = keyboard.nextInt();
        System.out.println("Enter second integer :");
        int second = keyboard.nextInt();
        System.out.println("enter three integers :");
        int third = keyboard.nextInt();

        int sum = first + second + third;
        int average = sum / 3;
        int product = first * second * third * third;
        System.out.println("The average is " + average);
        System.out.println("The product is " + product);
        System.out.println("The sum is " + sum);
        System.out.println();

        if(first > second && first > third){
            System.out.println(" first number is greater than second number and third number : " + first);
        }

        else if(second > first && second > third) {
            System.out.println("second number  is greater than first number and second number : " + second);
        }

        else {
            System.out.println(" third number is less than number first and second : " + third);
        }


          if(first  < second && first < third){
            System.out.println(" first number is less than second number and third number : " + first);
        }

          else if(second < first && second < third){
              System.out.println(" second number is less than second number and third number : " + second);
          }
          else {
            System.out.println("third number is less than first number and second number : " + third);
        }
    }
}
