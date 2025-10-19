package sprint1Tasca_S108Nivell1_8;

import java.util.Scanner;

/**
 * ClassName: FunctionReverseEntry
 * Package: sprint1Tasca_S108Nivell1_8
 * Description:
 * Author: Rong Jiang
 * Create:19/10/2025 - 17:54
 * Version:v1.0
 */
public class FunctionReverseEntry {
    private static final Scanner sc = new Scanner(System.in);


    public static String readString(String message) {
        while (true) {
            System.out.println(message);
            String input = sc.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Entrada vacía.");
                continue;
            }
            return input;
        }
    }
}
