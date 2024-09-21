package Chapter2;

import java.util.Scanner;

public class TwoTwoSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 = input.nextInt();
        System.out.println("Enter second number :");
        int num2 = input.nextInt();

        int sum1 = num1 + num1 + num1;
        int sum2 = num2 + num2 ;

        if(sum1 == sum2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
