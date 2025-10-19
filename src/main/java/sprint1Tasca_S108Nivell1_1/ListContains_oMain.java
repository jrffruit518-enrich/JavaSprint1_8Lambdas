package sprint1Tasca_S108Nivell1_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
        List<String> list = new ArrayList<String>(Arrays.asList("Own", "bowl", "fine", "Offside", "object", "good", "nice"));
        List <String> listNew = listContainsO(list);
        listNew.forEach(System.out::println);

    }

    public static  List<String> listContainsO(List<String> list) {

        return list.stream().filter(s -> s.toLowerCase().contains("o")).toList();
    }

}

