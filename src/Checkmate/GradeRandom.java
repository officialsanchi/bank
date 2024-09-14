package Checkmate;
import java.util.Scanner;
import java.util.Random;


public class GradeRandom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int firstNumber = rand.nextInt(31,80);
        int secondNumber = rand.nextInt(1,30);
        int result = firstNumber - secondNumber;

        System.out.println(firstNumber+" -"+ secondNumber + " : ");
        int answer = scanner.nextInt();


        if(result == answer) {
            System.out.println("You win!");
        }
        else {
            System.out.println("You lost!");
        }
        int count = 1;
        while(answer != result) {
            count+=1;

            System.out.println(firstNumber+" -"+ secondNumber+ ":");
            answer = scanner.nextInt();
            if(result == answer) {
                System.out.println("You win!");
                System.out.println("number of time you lost:" +(count - 1));
                break;
            }
            else if(count == 10) {
                System.out.println("You lost!");
                System.out.println(count - 1);
                break;
            }
             else {
                System.out.println("You lost!");
            }
        }
    }
}
