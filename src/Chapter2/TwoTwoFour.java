package Chapter2;

import java.util.Scanner;

public class TwoTwoFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();
        System.out.println("Enter fourth number: ");
        int num4 = input.nextInt();
        System.out.println("Enter fifth number: ");
        int num5 = input.nextInt();

        if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("Num1 is the greatest number :"+num1);
        }
        else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
            System.out.println("num2 is greatest number : "+num2);
        }
        else if (num3 > num1 && num3 > num4 && num3 > num5 && num3 > num2) {
            System.out.println("num3 is greatest number : "+num3);
        }
        else if(num4 > num1 && num4 > num3 && num4 > num5 && num4 > num2) {
            System.out.println("num4 is greatest number : "+num4);

        }
        else{
            System.out.println("Num5 is the greatest number :"+num5);
        }


        if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
            System.out.println("Num1 is the lesser number :"+num1);
        }
        else if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
            System.out.println("num2 is lesser number : "+num2);
        }
        else if (num3 < num1 && num3 < num4 && num3 < num5 && num3 < num2) {
            System.out.println("num3 is lesser number : "+num3);
        }
        else if(num4 < num1 && num4 < num3 && num4 < num5 && num4 < num2) {
            System.out.println("num4 is lesser number : "+num4);

        }
        else{
            System.out.println("Num5 is the lesser number :"+num5);
        }
    }
}
