package numbers1;

public class SquareRootPrecision {

    public static double squareRoot(double n, double precision) {
        double start = 0, end = n;
        double mid;

        // Narrow down using binary search
        while ((end - start) > precision) {
            mid = (start + end) / 2;
            if (mid * mid > n) {
                end = mid;
            } else {
                start = mid;
            }
        }

        // Either start or end is close enough
        return (start + end) / 2;
    }

    public static void main(String[] args) {
        double number = 7;
        double precision = 0.00001;  // up to 5 decimal places

        double sqrt = squareRoot(number, precision);
        System.out.printf("Square root of %.5f is %.5f\n", number, sqrt);
    }
}

