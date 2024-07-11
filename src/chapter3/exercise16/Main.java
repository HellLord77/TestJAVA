package chapter3.exercise16;

public class Main {
    public static int randInt(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    public static void main(String[] args) {
        int width = 100;
        int height = 200;

        int halfWidth = width / 2;
        int halfHeight = height / 2;

        int x = randInt(-halfWidth, halfWidth);
        int y = randInt(-halfHeight, halfHeight);

        System.out.println("(x, y) = (" + x + ", " + y + ")");
    }
}
