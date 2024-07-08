package vehicletypes;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

interface SellingPoint {
    public void sellingPoint();
}

class calcTime{

    public void howLongToTravel(int distance, int speed){

            double time = distance/speed;

            System.out.println("You will need " + time +" hours for this distance");


    }



}


abstract class Vehicles implements SellingPoint {

    private int accelarate = 0;
    private int countOfWheels = 0;
    private int breaks = 0;
    private final int currentSpeed;



    Vehicles(int acc, int countOfWheels, int breaks, int currentSpeed) {
        this.accelarate = acc;
        this.countOfWheels = countOfWheels;
        this.breaks = breaks;
        this.currentSpeed = currentSpeed;
    }

    public void getStats() {

        Integer[] statsArray = { accelarate, countOfWheels, breaks, currentSpeed };
        List<Integer> statsList = Arrays.asList(statsArray);

        System.out.println(statsList);
    }

}

class Car extends Vehicles {

    Car() {
        super(6, 4, 4, 100);
    }

    @Override
    public void sellingPoint() {
        System.out.println("Makes Brumm bruum");
    }

}

class Plane extends Vehicles  {

    Plane() {
        super(10, 3, 3, 200);
    }

    public void sellingPoint() {
        System.out.println("Can Fly");
    }
}

class Truck extends Vehicles  {

    Truck() {
        super(4, 6, 6, 50);
    }

    public void sellingPoint() {
        System.out.println("Brings your amazon packages");
        ;
    }

}

class Bicycle extends Vehicles  {

    Bicycle() {
        super(2, 2, 2, 20);

    }
    @Override
    public void sellingPoint() {
        System.out.println("Makes Brumm bruum");
    }


}

public class VehicleApp {

    public static void vehicleTypes(Scanner scanner) {

        System.out.println("Hy my name is Marv, but you can call me Boss,  should i build a ride for ya'? ");
        System.out.println("Yes(1)\nNo(0)");
        byte choice = scanner.nextByte();

        Boolean boo = false;

        if (choice == 0)
            System.out.println("\nGet lost fucker!");
        else {
            boo = true;
            System.out.println("I will find the perfect vehicle for ya!\nJust answer some questions!");
        }

        while (boo) {

            System.out.println("Do you hate meat?\nYes(1)\nNo(0)");
            scanner.nextByte();
            System.out.println("How do You pronounce GIF?\n GIF(1)\n GIF(0)");
            scanner.nextByte();
            System.out.println("Whats your zodiac sign?");
            scanner.nextLine();
            System.out.println(
                    "How would feel if i told you this questions are useless because i haven't implented an algorythm to process them? \nTell me your feelings in 50 or more words about your disapointment\nDo you think it has somthing to do with your relationship with your parents?");
            int answer = scanner.nextLine().length();

            if (answer <= 50) {
                System.out.println("\nToo short! Now we have to start again!");
                continue;
            }

            System.out.println("\nWow, that was deep man, im sorry for that. \n  ");

            System.out.println("Ok here are the vehicles you can buy.\nCar(1)\nPlane(2)\nBicycle(3)\nTruck(4)");
            choice = scanner.nextByte();

            Vehicles obj;
            switch (choice) {

                case 1:
                    obj = new Car();
                case 2:
                    obj = new Plane();
                case 3:
                    obj = new Bicycle();
                case 4:
                    obj = new Truck();
                default:
                    obj = new Car();
            }

            System.out.println("What do you want to know about it?\nUnique Selling Point(1) \n nothing(0)");

            choice = scanner.nextByte();

            if (choice == 1){
                System.out.println("\n  ");             
                
                obj.sellingPoint();
                System.out.println("\nHave fun with it, im too tired to write more code. Now get lost.\n");
            }
            else
                System.out.println("bye");

            
            break;
        }

    }

}
