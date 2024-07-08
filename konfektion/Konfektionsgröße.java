package konfektion;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Konfektionsgröße {

    public static void clothingSize(Scanner scanner) {
        Map<Integer, Double> anwsers = new HashMap<>();

        int index = 0;
        for (SizeBot question : SizeBot.values()) {
            String q = question.getMessage();
            System.out.println(q);
            if (index != 0) {
                double input = scanner.nextDouble();
                anwsers.put(index, input);
            }
            index++;
        }

        double bustSize = anwsers.get(1);
        double height = anwsers.get(2);
        double gender = anwsers.get(3);

        int size = (int) (Sizes.Calc(bustSize, height, gender));

        System.out.println("Your Size is: " + size);


    }
}
