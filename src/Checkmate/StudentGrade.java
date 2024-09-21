package Checkmate;
import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.println("NAME OF SCHOOL: LAGBAJA SCHOOL");
        System.out.print("Name of teacher : ");
        String name = input.nextLine();

        System.out.print("Enter number of student : ");
        int numberOfStudent = input.nextInt();
        System.out.print("Enter number of subject : ");
        int numberOfSubject = input.nextInt();
        int total = 0;


        int [][] nameAndSubject = new int [numberOfStudent][numberOfSubject];
        double [] average = new double [numberOfSubject];
        int [] studentTotal = new int [numberOfStudent];
        int [] newTotal = new int [numberOfStudent];
        double [] newAverage = new double [numberOfStudent];


        for(int count = 0, student = 1 ; count < numberOfStudent; count++, student++) {
            int sum = 0;
            int counter = 0;
            int subject = 1;
            for (counter = 0, subject = 1; counter < numberOfSubject; counter++, subject++) {
                System.out.println("student " + student + " subject" + subject + ":");
                nameAndSubject[count][counter] = input.nextInt();
                System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved successfully");
                System.out.println("===========================================================");
                sum+=nameAndSubject [count][counter];

            }
            studentTotal[count] = sum;
            newTotal[count] = sum;
            average[count] = sum / numberOfSubject;


        }


        System.out.print("STUDENT\t");
        for(int index = 0; index < numberOfSubject; index++) {
            System.out.print("\tSUB"+ (index+1));
        }
        System.out.print("\tTOT    \tAVE    \tPOS    \n");


        for(int index = 0; index < numberOfStudent; index++ ) {
            System.out.print("student" + (index + 1) + "\t");
            for (int element = 0; element < numberOfSubject; element++) {
                System.out.print(nameAndSubject[index][element]+"\t");
            }
            System.out.print(studentTotal[index]+"\t"+average[index]+"\t");
            System.out.println();
        }

    }
}