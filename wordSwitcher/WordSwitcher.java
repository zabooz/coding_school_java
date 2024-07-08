package wordSwitcher;

import java.util.Scanner;

public class WordSwitcher {

    public static void reverse(Scanner scanner) {

        String reversed = "";

        while(true){
            System.out.println("\nHello, I'm George your Word-reverse-reverser-bot. \nPlease Enter your String:");
            String input = scanner.nextLine();
            reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Your reversed String: ");
            System.out.println("\n" +reversed +"\n");

            System.out.println("Again?\n\nPress 1 to reverse another string. \nPress 0 to go back to the Menu.");
            int choice = Integer.parseInt(scanner.nextLine());

            if(choice == 0){
                break;
            }



        }



    }

}
