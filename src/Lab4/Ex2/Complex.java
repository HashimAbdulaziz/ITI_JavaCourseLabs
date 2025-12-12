package Lab4.Ex2;
import java.lang.Number;

public class Complex <R extends Number, I extends Number> {
    R real;
    I img;

    public Complex(R real, I img){
        if (real == null || img == null) {
            throw new IllegalArgumentException("real and imaginary parts cannot be null");
        }

        this.real = real;
        this.img = img;
    }

    public Complex<Double, Double> add(Complex<? extends Number, ? extends Number> c1){
        double realSum = this.real.doubleValue() + c1.real.doubleValue();
        double imgSum = this.img.doubleValue() + c1.img.doubleValue();

        return new Complex<>(realSum, imgSum);
    }

    public Complex<Double, Double> sub(Complex<? extends Number, ? extends Number> c1){
        double realSum = this.real.doubleValue() - c1.real.doubleValue();
        double imgSum = this.img.doubleValue() - c1.img.doubleValue();

        return new Complex<>(realSum, imgSum);
    }

    @Override
    public String toString() {
        return real + " + " + img + "i";
    }

    /*
    public void println(Object obj) {
        String s = String.valueOf(obj);
        print(s);
        newLine();
    }

    public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }

     */


}
