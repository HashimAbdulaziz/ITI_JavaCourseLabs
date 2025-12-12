package Lab4.Ex2;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try {
            Complex<Double, Double> c1 = new Complex<>(1.0, 2.0);
            Complex<Double, Double> c2 = new Complex<>(2.0, 4.0);

            Complex<Double, Double> sum = c1.add(c2);
            System.out.println("Sum: " + sum);

            Complex<Double, Double> c3 = new Complex<>(null, 3.0);

        }catch (IllegalArgumentException | NullPointerException e) {
            System.out.println(e.getMessage());
        }




    }

}
