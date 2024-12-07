import com.chap06.sub01.Calculator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class CalculatorImportMain {
    public static void main(String[] args) {
        List<BigDecimal> nums = new ArrayList<>();
        nums.add(new BigDecimal("10.5"));
        nums.add(new BigDecimal("20.75"));
        nums.add(new BigDecimal("30"));

        Calculator calc = new Calculator();
        double result = calc.sum(nums);

        System.out.println("총합은"+result+"입니다");
    }
}
