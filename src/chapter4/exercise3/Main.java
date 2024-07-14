package chapter4.exercise3;

public class Main {
    public static double getDistance(double x1, double y1, double x2, double y2) {
        double radius = 6371.01;
        return radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }

    public static double getArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        double atlantaX = 33.748997;
        double atlantaY = -84.387985;
        double orlandoX = 28.538336;
        double orlandoY = -81.379234;
        double savannahX = 32.080898;
        double savannahY = -81.091202;
        double charlotteX = 35.227085;
        double charlotteY = -80.843124;

        double dAtlantaOrlando = getDistance(atlantaX, atlantaY, orlandoX, orlandoY);
        double dSavannahAtlanta = getDistance(savannahX, savannahY, atlantaX, atlantaY);
        double dSavannahOrlando = getDistance(savannahX, savannahY, orlandoX, orlandoY);
        double dCharlotteAtlanta = getDistance(charlotteX, charlotteY, atlantaX, atlantaY);
        double dCharlotteOrlando = getDistance(charlotteX, charlotteY, orlandoX, orlandoY);

        double aSavannahAtlantaOrlando = getArea(dAtlantaOrlando, dSavannahAtlanta, dSavannahOrlando);
        double aCharlotteAtlantaOrlando = getArea(dAtlantaOrlando, dCharlotteAtlanta, dCharlotteOrlando);
        double aAtlantaOrlandoSavannahCharlotte = aSavannahAtlantaOrlando + aCharlotteAtlantaOrlando;

        System.out.printf("Area: %f km2%n", aAtlantaOrlandoSavannahCharlotte);
    }
}
