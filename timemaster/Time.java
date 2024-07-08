package timemaster;

import java.util.Scanner;

class TimeCalc {

    int hours = 0;
    int minutes = 0;
    int seconds = 0;
    int timeInSec = 0;
    String time = "";

    TimeCalc() {

    }

    TimeCalc(int sec) {
        this.seconds = sec;

        this.timeInSec = sec;

    }

    TimeCalc(int hours, int minutes, int seconds) {

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        timeInSec = hours * 3600 + minutes * 60 + seconds;
    }

    void formatTime(int timeInSec) {

        this.hours = timeInSec / 3600;
        this.minutes = (timeInSec % 3600) / 60;
        this.seconds = timeInSec % 60;

        time = String.format("%02d:%02d:%02d", this.hours, this.minutes, this.seconds);

    }

    public String getTime() {
        this.formatTime(this.timeInSec);
        return this.time;
    }

    public void setTime(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public String add(TimeCalc time) {
        this.timeInSec += time.timeInSec;
        this.formatTime(timeInSec);
        return this.time;
    }

    public String subtract(TimeCalc time) {
        this.timeInSec -= time.timeInSec;
        this.formatTime(timeInSec);
        return this.time;
    }

}

public class Time {

    public static void timeMaster(Scanner scanner) {
        while(true){

            System.out.println("Hy, I'm timemaster Bob, please set your time. \n [Format: HH:MM:SS or empty]");
    
            String timeString = scanner.nextLine();
    
            String[] artefacts = timeString.split(":");
    
            TimeCalc time = new TimeCalc();
            TimeCalc time2 = new TimeCalc();
    
            int hours;
            int minutes;
            int seconds;
    
            if (artefacts.length == 3) {
                hours = Integer.parseInt(artefacts[0]);
                minutes = Integer.parseInt(artefacts[1]);
                seconds = Integer.parseInt(artefacts[2]);
    
                time = new TimeCalc(hours, minutes, seconds);
    
            } else if (artefacts.length == 1) {
                time = new TimeCalc();
            } else {
                System.out.println(" Wrong format or input");
            }
    
            System.out.println("Time set: " + time.getTime() + "\n");
    
            System.out.println(" What would you like to do? \n Press 1 for adding time \n Press 2 to substract time");
    
            byte choice = scanner.nextByte();
            scanner.nextLine();
    
            while (true) {
                System.out.println(
                        "Please Enter Time to add/substract \n Format: HH:MM:SS or just seconds(S|SS|SSS|SSSS and so on)");
    
                artefacts = scanner.nextLine().split(":");
    
                System.out.println("Your new time");
                ;
    
                if (artefacts.length == 3) {
                    hours = Integer.parseInt(artefacts[0]);
                    minutes = Integer.parseInt(artefacts[1]);
                    seconds = Integer.parseInt(artefacts[2]);
                    if (choice == 1) {
    
                        time2 = new TimeCalc(hours, minutes, seconds);
    
                        time.add(time2);
    
                        String result = time.getTime();
    
                        System.out.println(result);
                    } else if (choice == 2) {
                        time2 = new TimeCalc(hours, minutes, seconds);
    
                        time.subtract(time2);
    
                        String result = time.getTime();
    
                        System.out.println(result);
                    } else {
                        System.out.println("Wrong Input");
                    }
                    break;
                } else if (artefacts.length == 1) {
    
                    seconds = Integer.parseInt(artefacts[0]);
    
                    if (choice == 1) {
    
                        time2 = new TimeCalc(seconds);
    
                        time.add(time2);
    
                        String result = time.getTime();
    
                        System.out.println(result);
                    } else if (choice == 2) {
                        time2 = new TimeCalc(seconds);
    
                        time.subtract(time2);
    
                        String result = time.getTime();
    
                        System.out.println(result);
    
                    }
    
                    break;
                } else {
                    System.out.println("SOemthing is wrong, i can feel it");
                }
    
            }


            System.out.println("Again?\n Press 1 to continue\nPress 0 to go back to the menu.");
            choice = (byte)(Integer.parseInt(scanner.nextLine()));

            if(choice == 0){
                break;
            }

        }

    }

}
