package Chapter2;

import java.util.Scanner;

public class TwoPointSix {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                System.out.println("Collect first number :");
                int first = input.nextInt();
                System.out.println("Collect second number :");
                int second = input.nextInt();
                System.out.println("Collect third number :");
                int third = input.nextInt();
                int result = first * second * third;


                System.out.print(result);
            }
        }



