package konfektion;

public class Sizes {
    static int longSize = 170;
    static int shortSize = 164;

    public static double Calc(double bust, double height, double gender) {
        if (gender == 0) {
            return bust / 2;
        } else {
            if (height > longSize) {
                return (bust / 2 - 6) * 2;
            } else if (height < shortSize) {
                return (bust / 2 - 6) / 2;
            } else {
                return bust / 2 - 6;
            }
        }
    }
}

