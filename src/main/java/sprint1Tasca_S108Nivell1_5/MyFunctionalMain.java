package sprint1Tasca_S108Nivell1_5;

/**
 * ClassName: MyFunctionalMain
 * Package: sprint1Tasca_S108Nivell1_5
 * Description: Main class to demonstrate the use of MyFunctional interface to print Pi value
 * Author: Rong Jiang
 * Create:19/10/2025 - 16:08
 * Version:v1.0
 */
public class MyFunctionalMain {
    public static void main(String[] args) {
        MyFunctional myFunctional = ()-> 3.1415;
        System.out.println(myFunctional.getPiValue());
    }
}
