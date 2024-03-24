public class GeometricFigures {
    private static int numberOfCalculations;

    public static int getNumberOfCalculations() {
        return numberOfCalculations;
    }

    public static double TriangleArea(double x, double y, double z) {
        double p = (x + y + z) / 2;
        double area = Math.sqrt(p * (p - x) * (p - y) * (p - z));
        numberOfCalculations++;
        return area;
    }

    public static double RectangleArea(double x, double y) {
        double area = x * y;
        numberOfCalculations++;
        return area;
    }

    public static double SquareArea(double x) {
        double area = x * x;
        numberOfCalculations++;
        return area;
    }

    public static double RhombusArea(double x, double y) {
        double area = (x * y) / 2;
        numberOfCalculations++;
        return area;
    }
}
