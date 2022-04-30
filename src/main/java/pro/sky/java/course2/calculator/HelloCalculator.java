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
    public int calculatorSum (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
       return calculatorService.calculatorSum(num1, num2);
    }
    @GetMapping("calculator/minus")
    public int calculatorMinus (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
      return calculatorService.calculatorMinus(num1, num2);
    }
    @GetMapping("calculator/multiply")
    public int calculatorMultiply (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
       return calculatorService.calculatorMultiply(num1, num2);
    }
    @GetMapping("calculator/divide")
    public int calculatorDivide (@RequestParam("num1") int num1, @RequestParam("num2") int num2){
       return calculatorService.calculatorDivide(num1, num2);
    }
}
