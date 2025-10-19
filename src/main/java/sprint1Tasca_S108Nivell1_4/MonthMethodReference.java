package sprint1Tasca_S108Nivell1_4;

import sprint1Tasca_S108Nivell1_3.MonthLambdas;

import java.util.Arrays;

/**
 * ClassName: MonthMethodReference
 * Package: sprint1Tasca_S108Nivell1_4
 * Description:
 * Author: Rong Jiang
 * Create:19/10/2025 - 15:08
 * Version:v1.0
 */
public class MonthMethodReference {
    public static void main(String[] args) {
        Arrays.stream(MonthLambdas.values()).map(MonthLambdas::getName ).forEach(System.out::println);
    }

}
