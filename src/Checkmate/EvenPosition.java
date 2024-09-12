package Checkmate;

import java.util.Scanner;


public class EvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of positions you want to check: ");
        String position = sc.nextLine();

        for (int element = 0; element < position.length(); element+=2) {

                    System.out.println(position.charAt(element));



            }
        }
    }

