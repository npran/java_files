import java.util.Scanner;

class Tabletop {
    private double width;
    private double height;

    // Parameterized constructor
    public Tabletop(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Returns area
    public double getArea() {
        return width * height;
    }

    // Returns perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Static method to find largest area
    public static double findLargestTabletopArea(Tabletop[] tabletops) {
        double max = tabletops[0].getArea();
        for (Tabletop t : tabletops) {
            if (t.getArea() > max) {
                max = t.getArea();
            }
        }
        return max;
    }

    // Static method to find smallest area
    public static double findSmallestTabletopArea(Tabletop[] tabletops) {
        double min = tabletops[0].getArea();
        for (Tabletop t : tabletops) {
            if (t.getArea() < min) {
                min = t.getArea();
            }
        }
        return min;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Tabletop[] tabletops = new Tabletop[n];

        for (int i = 0; i < n; i++) {
            double width = sc.nextDouble();
            double height = sc.nextDouble();
            tabletops[i] = new Tabletop(width, height);
        }

        double largest = Tabletop.findLargestTabletopArea(tabletops);
        double smallest = Tabletop.findSmallestTabletopArea(tabletops);

        System.out.printf("Largest: %.2f%n", largest);
        System.out.printf("Smallest: %.2f%n", smallest);

        for (int i = 0; i < n; i++) {
            System.out.printf("Perimeter %d: %.2f%n", i + 1, tabletops[i].getPerimeter());
        }

        sc.close();
    }
}
