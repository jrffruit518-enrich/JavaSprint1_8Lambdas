package sprint1Tasca_S108Nivell1_8;

/**
 * ClassName: FunctionReverseMain
 * Package: sprint1Tasca_S108Nivell1_8
 * Description:
 * Author: Rong Jiang
 * Create:19/10/2025 - 17:32
 * Version:v1.0
 */
public class FunctionReverseMain {
    public static void main(String[] args) {
        FunctionReverse functionReverse = s -> {
            StringBuilder s1 = new StringBuilder(s);
            return s1.reverse().toString();
        };

        String arg = "open file";
        System.out.println(functionReverse.reverse(arg));
    }
}
