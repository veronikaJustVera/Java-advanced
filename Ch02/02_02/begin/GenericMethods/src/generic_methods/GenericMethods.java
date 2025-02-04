package generic_methods;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bethan
 */
public class GenericMethods {

    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};
    static String[] stringArray = {"hello", "world", "!!!"};

    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<String> stringList = arrayToList(stringArray, new ArrayList<>());
        System.out.println(stringList.get(0));
    }

}
