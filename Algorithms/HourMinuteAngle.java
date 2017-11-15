/**
 * @author Skylifee7 on 04/11/2017.
 */
public class HourMinuteAngle {

    public static void main(String[] args) {
        System.out.println(angle(12, 59));
    }

    private static double angle(int h, int m) {
        // Convert hour to minute
        if (!(h < 0 || m < 0 || h > 12 || m > 60)) {
            double hourAngle = (float) 0.5 * h * 60;
            double minAngle = (float) 6 * m;

            return Math.abs((hourAngle) - (minAngle));
        }
        return 0.0;
    }
}
