
package linkedlistexample;

import java.util.LinkedList;

/**
 *
 * @author bethan
 */
public class LinkedListExampleBegin {
    
    
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(23);
        intList.add(45);
        intList.add(1, 100);
        //intList.add(10, 100);
        System.out.println(intList);
        intList.remove(0);
        System.out.println(intList);
        //intList.remove(10);


        LinkedList<String> strList = new LinkedList<>();
        strList.add("A");
        strList.add("B");
        strList.add(1, "C");
        strList.add("Specific string");
        System.out.println(strList);
        strList.remove("Specific string");
        System.out.println(strList);
        strList.remove(0);
        System.out.println(strList);
    }

    
}
