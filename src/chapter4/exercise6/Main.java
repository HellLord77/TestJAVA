package chapter4.exercise6;

public class Main {
    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double r = 40;

        double alpha1 = Math.random() * 2 * Math.PI;
        double x1 = r * Math.cos(alpha1);
        double y1 = r * Math.sin(alpha1);
        System.out.printf("(x1, y1) = (%f, %f)%n", x1, y1);

        double alpha2 = Math.random() * 2 * Math.PI;
        double x2 = r * Math.cos(alpha2);
        double y2 = r * Math.sin(alpha2);
        System.out.printf("(x2, y2) = (%f, %f)%n", x2, y2);

        double alpha3 = Math.random() * 2 * Math.PI;
        double x3 = r * Math.cos(alpha3);
        double y3 = r * Math.sin(alpha3);
        System.out.printf("(x3, y3) = (%f, %f)%n", x3, y3);

        double A = getDistance(x1, y1, x2, y2);
        double B = getDistance(x2, y2, x3, y3);
        double C = getDistance(x3, y3, x1, y1);

        double a = Math.acos((B * B + C * C - A * A) / (2 * B * C));
        double b = Math.acos((C * C + A * A - B * B) / (2 * C * A));
        double c = Math.acos((A * A + B * B - C * C) / (2 * A * B));
        System.out.printf("a = %f rad, b = %f rad, c = %f rad%n", a, b, c);
    }
}
