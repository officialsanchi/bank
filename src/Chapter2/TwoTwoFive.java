package Chapter2;

import java.util.Scanner;

public class TwoTwoFive {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = keyboard.nextInt();

        if(num1 %3 == 0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
