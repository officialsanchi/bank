package Checkmate;

import java.util.Scanner;

public class OddIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int number = scanner.nextInt();

        for (int element = 1; element < number+1; element++) {
            for(int index = 1; index< element+1; index++){
                System.out.println(index +"");

            }
            System.out.println();
        }

    }
}
