package sprint1Tasca_S108Nivell1_8;

/**
 * ClassName: FunctionReverseMain
 * Package: sprint1Tasca_S108Nivell1_8
 * Description:Main class to demonstrate string reversal using FunctionReverse interface
 * Author: Rong Jiang
 * Create:19/10/2025 - 17:32
 * Version:v1.0
 */
public class FunctionReverseMain {
    public static void main(String[] args) {
        FunctionReverse functionReverse = s -> s==null?"":new StringBuilder(s).reverse().toString();

        String arg = FunctionReverseEntry.readString("Please enter a word") ;

        System.out.println(functionReverse.reverse(arg));

        System.out.println(functionReverse.reverse(arg).contentEquals(new StringBuilder(arg).reverse()) ? "The method is successful." : "The method failed.");
    }
}
