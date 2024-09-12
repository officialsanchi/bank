package Checkmate;


import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int input = scanner.nextInt();



        for(int count =1; count < input+1; count++) {
            for(int counter =1; counter< count+1; counter++) {
                System.out.print(counter+" ");
            }
            System.out.println(" ");

        }

    }




}
