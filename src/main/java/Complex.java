public class Complex {
    private Double real;
    private Double imaginary;

    public Complex(String complexString) {
        String[] complexStringParsed = complexString.split("i");
        this.real = Double.valueOf(complexStringParsed[0]);
        this.imaginary = Double.valueOf(complexStringParsed[1]);
    }

    public Complex(Double real, Double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(Integer real, Integer imaginary) {
        this.real = Double.valueOf(real);
        this.imaginary = Double.valueOf(imaginary);
    }

    public Complex(Double real, Integer imaginary) {
        this.real = real;
        this.imaginary = Double.valueOf(imaginary);
    }

    public Complex(Integer real, Double imaginary) {
        this.real = Double.valueOf(real);
        this.imaginary = imaginary;
    }

    public Double getReal() {
        return real;
    }

    public Double getImaginary() {
        return imaginary;
    }
}
