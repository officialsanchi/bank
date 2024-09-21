package Chapter2;
import java.util.Scanner;

public class TwoOneFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter  first integer :");
        int first = input.nextInt();
        System.out.println("Enter  second integer :");
        int second = input.nextInt();

        int square1 = first * first;
        int square2 = second * second;
        int sum = square1 + square2;
        int difference = square1 - square2;
        System.out.println("The sum is : "+sum);
        System.out.println("Difference is : "+difference);
        System.out.println("The square1 is : "+square1);
        System.out.println("The square2 is : "+square2);
    }
}
