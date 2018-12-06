public class Rational {
    private Integer numerator;
    private Integer denominator;

    public Rational(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational(String numerator, String denominator) {
        this.numerator = Integer.valueOf(numerator);
        this.denominator = Integer.valueOf(denominator);
    }

    public Integer getNumerator() {
        return numerator;
    }

    public Integer getDenominator() {
        return denominator;
    }
}
