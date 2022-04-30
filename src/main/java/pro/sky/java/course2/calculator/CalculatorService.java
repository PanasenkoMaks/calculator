package pro.sky.java.course2.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public String Hello (){
        return "Hello";
    }

    public int calculatorSum (int num1, int num2){
        int rezult = num1 + num2;
        return rezult;
    }

    public int calculatorMinus (int num1, int num2){
        int rezult = num1 - num2;
        return rezult;
    }
    public int calculatorMultiply (int num1, int num2){
        int rezult = num1 * num2;
        return rezult;
    }

    public int calculatorDivide (int num1, int num2){
        int rezult = num1 / num2;
        return rezult;
    }
}
