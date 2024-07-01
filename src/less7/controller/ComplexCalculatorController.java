package less7.controller;

import less7.logger.CalculatorLogger;
import less7.model.ComplexNumbers;
import less7.service.ComplexNumberService;

public class ComplexCalculatorController {
    private final ComplexNumberService service;

    public ComplexCalculatorController(ComplexNumberService service) {
        this.service = service;
    }

    public ComplexNumbers add(ComplexNumbers a, ComplexNumbers b) {
        ComplexNumbers result = service.add(a, b);
        CalculatorLogger.log(String.format("Складываем %s и %s результат равен %s", a, b, result));
        return result;
    }

    public ComplexNumbers multiply(ComplexNumbers a, ComplexNumbers b) {
        ComplexNumbers result = service.multiply(a, b);
        CalculatorLogger.log(String.format("Умножаем %s и %s результат равен %s", a, b, result));
        return result;
    }

    public ComplexNumbers divide(ComplexNumbers a, ComplexNumbers b) {
        try {
            ComplexNumbers result = service.divide(a, b);
            CalculatorLogger.log(String.format("Делим %s на %s результат равен %s", a, b, result));
            return result;
        } catch (ArithmeticException e) {
            CalculatorLogger.log(String.format("Ошибка деления %s на %s: %s", a, b, e.getMessage()));
            throw e;
        }
    }
}
