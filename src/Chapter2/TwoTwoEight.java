package Chapter2;

import java.util.Scanner;

public class TwoTwoEight {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter numbers: ");
        int radius = keyboard.nextInt();

        int diameter = 2 * radius;
        double circumference = 2 * Math.PI * diameter;
        double area = Math.pow((Math.PI * radius), 2);

        System.out.println(diameter);
        System.out.println(circumference);
        System.out.println(area);

    }
}
