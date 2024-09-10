package Checkmate;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
public class Largest {
    public static void main(String[] args) {
        ArrayList<Integer> pieces = new ArrayList();
        ArrayList<Integer> units = new ArrayList();
        ArrayList <String> items = new ArrayList();

        Scanner sc = new Scanner(System.in);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Name of customer");
        String name = sc.nextLine();
        System.out.println("what did customer buy");
        String item = sc.nextLine();
        System.out.println("How many pieces did the customer buy?");
        int piece = sc.nextInt();
        System.out.println("How much per unit?");
        int unit = sc.nextInt();
        System.out.println("Do you want to buy more item? if yes press 1 to countine or any other number to exist");
        int cont = sc.nextInt();
        int total = piece * unit;
        while (cont == 1) {
            System.out.println("what did customer buy");
            item = sc.next();
            System.out.println("How many pieces did the customer buy?");
            piece = sc.nextInt();
            System.out.println("How much per unit?");
            unit = sc.nextInt();
            System.out.println("Do you want to buy more item? if yes press 1 to countine or any other number to exist");
            cont = sc.nextInt();
        }
            System.out.println("What is your name?");
            String cashier = sc.next();
            System.out.println("How much discount will you get?");
            int discount = sc.nextInt();
            System.out.println("Semicolon store?");
            System.out.println("Main branch");
            System.out.println("Location: 312, Herbert macaulay way, sabo yaba, lagos.");
            System.out.println("Tel: 03293828343");
            System.out.println("Date" + now );
            int date = now.getDayOfMonth();
            System.out.println("Cashier : " + cashier);
            System.out.println("Customer Name : " + name);
        System.out.println("=======================================================================================================================================================================================================================================================================");
        System.out.println("""
          
                                    ITEM              QTY      PRICE   TOTAL(NGN) """);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("35%s20%d20%d30%f%n", item,units,pieces,total);


        }

    }
