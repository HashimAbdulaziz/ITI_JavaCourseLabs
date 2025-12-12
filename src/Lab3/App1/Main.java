package Lab3.App1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        TempConverter<Double, Double> converter = new TempConverter<Double, Double>() {
            @Override
            public Double convert(Double celsius) {
                return (celsius * 9.0 / 5.0) + 32.0;
            }
        };

        Scanner scanner = new Scanner(System.in);

        try {
            double cel = scanner.nextDouble();
            double fahr = converter.convert(cel);
            
            System.out.println(cel + " C = " + fahr + " F");
        }
        catch (InputMismatchException e) { System.out.println("Please enter numbers only."); }
    }
}

