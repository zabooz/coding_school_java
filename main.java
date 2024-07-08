import java.util.Scanner;

import konfektion.Konfektionsgröße;
import vehicletypes.VehicleApp;
import wordSwitcher.WordSwitcher;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        
        
        while (true) {
            System.out.println(
                "\nHello what would you like to do? \n \nPress 1 to Fashion Goddess Babsi\npress 2 to Right-to-left Goerge\nPress 3 to get to Timemaster Bob\nPress 4 to get to Marv \"The Wrench\" Hans \npress 0 to exit");
                
                int choice = scanner.nextInt();
                scanner.nextLine();
                System.out.println(choice);
                if (choice == 1)
                Konfektionsgröße.clothingSize(scanner);
                else if (choice == 2)
                WordSwitcher.reverse(scanner);
                else if (choice == 3) 
                timemaster.Time.timeMaster(scanner);
                else if(choice ==  4)
                VehicleApp.vehicleTypes(scanner);
                
                if (choice == 0) {
                    System.out.println("GoodBye!");
                scanner.close();
                break;
            }

        }
    }

}
