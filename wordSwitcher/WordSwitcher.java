package wordSwitcher;

import java.util.Scanner;

public class WordSwitcher {

    public static void reverse(Scanner scanner) {

        String reversed = "";

        System.out.println("Hello, I'm Gorge your Word-reverse-reverser-bot. Please Enter your String");
        String input = scanner.nextLine();
        System.out.println("bugs");
        reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);

    }

}
