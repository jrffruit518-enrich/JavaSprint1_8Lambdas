package sprint1Tasca_S108Nivell1_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        var months = new ArrayList<>(Arrays.asList(MonthLambdas.values()));
        print(months);

    }

    public static void print(List months) {
        months.forEach(month-> System.out.println());
    }
}
