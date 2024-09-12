package Checkmate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        String vowels = "AEIOUaeiou";

        for (int i = 2; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);


            if (Character.isLetter(ch)) {
                if (vowels.indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;

                }
            }
            System.out.print("vowels" + " " +  vowelCount);
            System.out.println("consonantCount" + " " + consonantCount);
        }
    }
}