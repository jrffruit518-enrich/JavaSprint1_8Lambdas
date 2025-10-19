package sprint1Tasca_S108Nivell1_3;


import java.util.Arrays;


/**
 * ClassName: MonthPrint
 * Package: sprint1Tasca_S108Nivell1_3
 * Description:
 * Author: Rong Jiang
 * Create:19/10/2025 - 15:08
 * Version:v1.0
 */
public class MonthPrint {
    public static void main(String[] args) {
        Arrays.stream(MonthLambdas.values()).map(month->month.getName() ).forEach(name -> System.out.println(name));
    }

}
