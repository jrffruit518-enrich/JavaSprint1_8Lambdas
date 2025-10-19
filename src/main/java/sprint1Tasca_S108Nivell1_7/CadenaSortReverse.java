package sprint1Tasca_S108Nivell1_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName: CadenaSortReverse
 * Package: sprint1Tasca_S108Nivell1_6
 * Description: Main class to filter and sort strings by length from a mixed list of numbers and strings
 * Author: Rong Jiang
 * Create:19/10/2025 - 16:29
 * Version:v1.0
 */
public class CadenaSortReverse {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(Arrays.asList(12,"baby","center",256,"hello",38,"good"));
        List<Object> listResult = list.stream().filter(o -> o != null && o instanceof String).sorted(Comparator.comparingInt(o -> -((String) o).length())).collect(Collectors.toList());
        listResult.forEach(System.out::println);
    }
}
