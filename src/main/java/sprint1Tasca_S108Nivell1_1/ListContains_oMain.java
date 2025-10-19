package sprint1Tasca_S108Nivell1_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * ClassName: ListContainsO
 * Package: sprint1Tasca_S108Nivell1_1
 * Description:
 * Author: Rong Jiang
 * Create:19/10/2025 - 12:56
 * Version:v1.0
 */
public class ListContains_oMain {
    public static void main(String[] args) {
        List<String> listInput = new ArrayList<String>(Arrays.asList("Own", "bowl", "fine", "Offside", "object", "good", "nice"));
        List <String> listResult = listContainsO(listInput);
        listResult.forEach(System.out::println);

    }

    public static  List<String> listContainsO(List<String> list) {

        return list.stream().filter(s -> s!=null && s.toLowerCase().contains("o")).collect(Collectors.toList());
    }

}

