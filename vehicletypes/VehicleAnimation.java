package vehicletypes;


public class VehicleAnimation {
    private String[] car;
    private String[] truck;
    private String[] airplane;
    private String[] bicycle;
    private int consoleWidth;

    public VehicleAnimation() {
        this.car = new String[] {
            "    ______",
            "  /|_||_\\`.__",
            " (   _    _ _\\",
            "=`-(_)--(_)-' "
        };

        this.truck = new String[] {
            "       ____________________________________________________",
            "     _|                                                   |",
            "  __|  _     ____       ____       ____       ____    ____|",
            " |  | | |   |    |     |    |     |    |     |    |  |    |",
            " |__|_|_|___|____|_____|____|_____|____|_____|____|__|____|"
        };

        this.airplane = new String[] {
            "          __|__",
            "------(_)------'",
            "         /    \\",
            "________/______\\________"
        };

        this.bicycle = new String[] {
            "    __o",
            "  _ \\<,_",
            " (_)/ (_)"
        };

        this.consoleWidth = 160; // Annahme einer Konsolenbreite von 80 Zeichen
    }

    public void startAnimation(int vehicleType) throws InterruptedException {
        String[] vehicle;

        switch (vehicleType) {
            case 1:
                vehicle = car;
                break;
            case 4:
                vehicle = truck;
                break;
            case 2:
                vehicle = airplane;
                break;
            case 3:
                vehicle = bicycle;
                break;
            default:
                throw new IllegalArgumentException("Invalid vehicle type. Choose a number from 1 to 4.");
        }

        int vehicleWidth = vehicle[0].length();
        int startPosition = 0;
        int endPosition = consoleWidth - vehicleWidth;

        for (int position = startPosition; position <= endPosition; position++) {
            printVehicleAtPosition(vehicle, position);
            Thread.sleep(100); // 100 Millisekunden Pause zwischen den Bewegungen
            clearConsole();
        }
    }

    private void printVehicleAtPosition(String[] vehicle, int position) {
        for (String line : vehicle) {
            System.out.println(" ".repeat(position) + line);
        }
    }

    private void clearConsole() {
        // ANSI escape codes to clear the console
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
