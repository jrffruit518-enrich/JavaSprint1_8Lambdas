package sprint1Tasca_S108Nivell1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: ListContains_oLenthMain
 * Package: sprint1Tasca_S108Nivell1_2
 * Description:
 * Author: Rong Jiang
 * Create:19/10/2025 - 14:01
 * Version:v1.0
 */
public class ListContains_oLengthMain {
    public static void main(String[] args) {
        List<String> listInput = new ArrayList<>(Arrays.asList("Own", "bowl", "fine", "Offside", "object", "good", "nice","oceans"));
        List <String> listResult = listContainsO_Length(listInput);
        listResult.forEach(System.out::println);

    }
    public static List<String> listContainsO_Length(List<String> list) {
        if (list== null) {
            throw new IllegalArgumentException("The list can't be null.");
        }
        return list.stream().filter(s -> s!=null && s.toLowerCase().contains("o") && s.length()>5).collect(Collectors.toList());
    }
}
