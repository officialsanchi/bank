package Chapter2;
import java.util.Scanner;

public class TwoOneSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Obtain a number from a  user: ");
        int number = input.nextInt();

        int sum = number * number;

        if(number == 100 && sum == 100) {
            System.out.println("number and sum is equal to 100");
        }
        else if(number != 100 && sum != 100 ){
            System.out.println("number and sum is not equal to 100");
        }
        else if(number < 100 && sum < 100 ){
            System.out.println("number and sum is less than 100");

        }
        else if(number > 100 && sum > 100){
            System.out.println("number and sum is greater than 100");
        }

        else{
            System.out.println("no");
        }

    }
}
