package less7.model;

public class ComplexNumbers {

    private final double real;
    private final double imaginary;

    public ComplexNumbers(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return String.format("%s + %si", real, imaginary);
    }
}

