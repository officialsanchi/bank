package Chapter2;
import java.util.Scanner;

public class TwoPointFive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Collect first number :");
        int first = input.nextInt();
        System.out.println("Collect second number :");
        int second = input.nextInt();
        System.out.println("Collect third number :");
        int third = input.nextInt();

        int result = first * second * third;


        System.out.printf("%s %s  %s %s", first, second, third, result);
    }
}
