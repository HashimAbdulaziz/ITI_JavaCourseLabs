package Lab3.App2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        TriFunction<Double, Double, Double, double[]> getRoots = (a, b, c) -> {
            double underRoot = b * b - 4 * a * c;
            if (underRoot < 0) return null;

            double r1 = (-b + Math.sqrt(underRoot)) / (2 * a);
            double r2 = (-b - Math.sqrt(underRoot)) / (2 * a);

            return new double[]{r1, r2};
        };

        Scanner scanner = new Scanner(System.in);

        try {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();

            double[] roots = getRoots.apply(a, b, c);

            if (roots == null) {
                System.out.println("no roots.");
            } else {
                System.out.println("r1 = " + roots[0]);
                System.out.println("r2 = " + roots[1]);
            }

        } catch (InputMismatchException e) {
            System.out.println("please enter numbers only.");
        }
    }
}

