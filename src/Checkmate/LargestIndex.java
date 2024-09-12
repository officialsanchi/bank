package Checkmate;

import java.util.Scanner;

public class LargestIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string word :");
        String first = sc.nextLine();
        System.out.println("Enter the second string word :");
        String second = sc.nextLine();
        System.out.println("Enter the third string word :");
        String third = sc.nextLine();
        System.out.println("Enter the fourth string word :");
        String fourth = sc.nextLine();

        if(first.length() > second.length()){
            System.out.println("The largest string word is " + first);
        }
        else {
            System.out.println("The largest string word is " + second);
        }

        if(third.startsWith(fourth)){
            System.out.println("The string starts with the prefix." );
        }
        else {
            System.out.println("The string  does not starts with the prefix." );
        }
    }
}
