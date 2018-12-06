import java.math.BigInteger;

public final class Utils {

    public static Rational rational_sum(Rational left, Rational right) {
        Integer numerator = left.getNumerator() * right.getDenominator() + left.getDenominator() * right.getNumerator();
        Integer denominator = left.getDenominator() * right.getDenominator();
        Integer gcd = BigInteger.valueOf(numerator).gcd(BigInteger.valueOf(denominator)).intValue();
        return new Rational(numerator / gcd, denominator / gcd);
    }

    public static Rational rational_sub(Rational left, Rational right) {
        Integer numerator = left.getNumerator() * right.getDenominator() - left.getDenominator() * right.getNumerator();
        Integer denominator = left.getDenominator() * right.getDenominator();
        Integer gcd = BigInteger.valueOf(numerator).gcd(BigInteger.valueOf(denominator)).intValue();
        return new Rational(numerator / gcd, denominator / gcd);
    }

    public static Rational rational_mult(Rational left, Rational right) {
        Integer numerator = left.getNumerator() * right.getNumerator();
        Integer denominator = left.getDenominator() * right.getDenominator();
        Integer gcd = BigInteger.valueOf(numerator).gcd(BigInteger.valueOf(denominator)).intValue();
        return new Rational(numerator / gcd, denominator / gcd);
    }

    public static Rational rational_sum(Integer leftInteger, Rational right) {
        Rational left = new Rational(leftInteger, 1);
        return rational_sum(left, right);
    }

    public static Rational rational_sum(Rational left, Integer rightInteger) {
        Rational right = new Rational(rightInteger, 1);
        return rational_sum(left, right);
    }

    public static Rational rational_sub(Integer leftInteger, Rational right) {
        Rational left = new Rational(leftInteger, 1);
        return rational_sub(left, right);
    }

    public static Rational rational_sub(Rational left, Integer rightInteger) {
        Rational right = new Rational(rightInteger, 1);
        return rational_sub(left, right);
    }

    public static Rational rational_mult(Integer leftInteger, Rational right) {
        Rational left = new Rational(leftInteger, 1);
        return rational_mult(left, right);
    }

    public static Rational rational_mult(Rational left, Integer rightInteger) {
        Rational right = new Rational(rightInteger, 1);
        return rational_mult(left, right);
    }

    public static Complex complex_sum(Complex left, Complex right) {
        return new Complex(left.getReal() + right.getReal(), left.getImaginary() + right.getImaginary());
    }

    public static Complex complex_sub(Complex left, Complex right) {
        return new Complex(left.getReal() - right.getReal(), left.getImaginary() - right.getImaginary());
    }

    public static Complex complex_mult(Complex left, Complex right) {
        Double real = left.getReal() * right.getReal() - left.getImaginary() * right.getImaginary();
        Double imag = left.getReal() * right.getImaginary() + left.getImaginary() * right.getReal();
        return new Complex(real, imag);
    }

    public static Complex complex_sum(Complex left, Integer rightInteger) {
        Complex right = new Complex(rightInteger, 0);
        return complex_sum(left, right);
    }

    public static Complex complex_sum(Integer leftInteger, Complex right) {
        Complex left = new Complex(leftInteger, 0);
        return complex_sum(left, right);
    }

    public static Complex complex_sum(Complex left, Double rightDouble) {
        Complex right = new Complex(rightDouble, 0);
        return complex_sum(left, right);
    }

    public static Complex complex_sum(Double leftDouble, Complex right) {
        Complex left = new Complex(leftDouble, 0);
        return complex_sum(left, right);
    }

    public static Complex complex_sub(Complex left, Integer rightInteger) {
        Complex right = new Complex(rightInteger, 0);
        return complex_sub(left, right);
    }

    public static Complex complex_sub(Integer leftInteger, Complex right) {
        Complex left = new Complex(leftInteger, 0);
        return complex_sub(left, right);
    }

    public static Complex complex_sub(Complex left, Double rightDouble) {
        Complex right = new Complex(rightDouble, 0);
        return complex_sub(left, right);
    }

    public static Complex complex_sub(Double leftDouble, Complex right) {
        Complex left = new Complex(leftDouble, 0);
        return complex_sub(left, right);
    }

    public static Complex complex_mult(Complex left, Integer rightInteger) {
        Complex right = new Complex(rightInteger, 0);
        return complex_mult(left, right);
    }

    public static Complex complex_mult(Integer leftInteger, Complex right) {
        Complex left = new Complex(leftInteger, 0);
        return complex_mult(left, right);
    }

    public static Complex complex_mult(Complex left, Double rightDouble) {
        Complex right = new Complex(rightDouble, 0);
        return complex_mult(left, right);
    }

    public static Complex complex_mult(Double leftDouble, Complex right) {
        Complex left = new Complex(leftDouble, 0);
        return complex_mult(left, right);
    }


}
