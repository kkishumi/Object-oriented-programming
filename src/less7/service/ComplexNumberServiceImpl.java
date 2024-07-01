package less7.service;

import less7.model.ComplexNumbers;

public class ComplexNumberServiceImpl implements ComplexNumberService {
    @Override
    public ComplexNumbers add(ComplexNumbers a, ComplexNumbers b) {
        double real = a.getReal() + b.getReal();
        double imaginary = a.getImaginary() + b.getImaginary();
        return new ComplexNumbers(real, imaginary);
    }

    @Override
    public ComplexNumbers multiply(ComplexNumbers a, ComplexNumbers b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new ComplexNumbers(real, imaginary);
    }

    @Override
    public ComplexNumbers divide(ComplexNumbers a, ComplexNumbers b) throws ArithmeticException {
        if (b.getReal() == 0 && b.getImaginary() == 0) {
            throw new ArithmeticException("Нельзя делить на 0");
        }
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        return new ComplexNumbers(real, imaginary);
    }
}