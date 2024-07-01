package less7;

import less7.controller.ComplexCalculatorController;
import less7.model.ComplexNumbers;
import less7.service.ComplexNumberService;
import less7.service.ComplexNumberServiceImpl;

public class Application {
    public static void run() {
        ComplexNumberService service = new ComplexNumberServiceImpl();
        ComplexCalculatorController controller = new ComplexCalculatorController(service);

        ComplexNumbers a = new ComplexNumbers(4, 7);
        ComplexNumbers b = new ComplexNumbers(1, 2);

        controller.add(a, b);
        controller.multiply(a, b);
        try {
            controller.divide(a, b);
        } catch (ArithmeticException e) {
            System.err.println("Исключение: " + e.getMessage());
        }
    }
}