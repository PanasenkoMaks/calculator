package pro.sky.java.course2.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCalculator {
    private CalculatorService calculatorService = new CalculatorService();
    @GetMapping
    public String Hello (){
        return calculatorService.Hello();
    }
    @GetMapping("calculator/plus")
    public int calculatorSum (@RequestParam(required = true) int num1, @RequestParam(required = true) int num2){
       return calculatorService.calculatorSum(num1, num2);
    }
    @GetMapping("calculator/minus")
    public int calculatorMinus (@RequestParam(required = true) int num1, @RequestParam(required = true) int num2){
      return calculatorService.calculatorMinus(num1, num2);
    }
    @GetMapping("calculator/multiply")
    public int calculatorMultiply (@RequestParam(required = true) int num1, @RequestParam(required = true) int num2){
       return calculatorService.calculatorMultiply(num1, num2);
    }
    @GetMapping("calculator/divide")
    public Object calculatorDivide (@RequestParam(required = true) int num1, @RequestParam(required = true) int num2){
        if (num2 == 0){
            return "Деление на 0 невозможно";
        }
       return calculatorService.calculatorDivide(num1, num2);
    }
}
