package less7.service;

import less7.model.ComplexNumbers;

public interface ComplexNumbersService {
    ComplexNumbers add(ComplexNumbers a, ComplexNumbers b);

    ComplexNumbers multiply(ComplexNumbers a, ComplexNumbers b);

    ComplexNumbers divide(ComplexNumbers a, ComplexNumbers b) throws ArithmeticException;
}