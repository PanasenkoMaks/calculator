package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements pro.sky.java.course2.calculator.Service {
    @Override
    public String Hello() {
        return "Hello";
    }

    @Override
    public int calculatorSum(Integer num1, Integer num2) {
        int rezult = num1 + num2;
        return rezult;
    }

    @Override
    public int calculatorMinus(Integer num1, Integer num2) {
        int rezult = num1 - num2;
        return rezult;
    }

    @Override
    public int calculatorMultiply(int num1, int num2) {
        int rezult = num1 * num2;
        return rezult;
    }

    @Override
    public int calculatorDivide(int num1, int num2) {
        int rezult = num1 / num2;
        return rezult;
    }

}