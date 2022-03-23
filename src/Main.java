import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(containsDuplicate(array));

        Integer[] array1 = {1,2,3,3,2,4,5,6,5};
        printUniqueElements(array1);

        String str = "12314223";
        printCountOfDuplicates(str);

        printFirstNotRepeatChar(str);

        String task5 = "abcdaefghbaijkla";
        printLengthOfSubstring(task5);

    }


    /**
     * printing elements that occurred only once in the array.
     * @param array
     * @param <K>
     */
    private static <K extends Number> void printUniqueElements(K[] array) {

        Map<K,Integer> numbers = new HashMap<>();
        for (K k : array) {
            if (numbers.containsKey(k)) {
                numbers.put(k, 2);
                continue;
            }
            numbers.put(k, 1);

        }
        for (Map.Entry<K,Integer> entry: numbers.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    /**
     * checking is given array contains duplicate elements
     * @param array
     * @param <T>
     * @return
     */
    private static <T extends Number> boolean containsDuplicate(T[] array) {
        Set<T> numbers = new HashSet<>();
        for (T t : array) {
            if (!numbers.add(t)) {
                return true;
            }
        }
        return false;
    }

    /**
     * printing first not repeated element in given string
     * @param str
     */
    private static void printFirstNotRepeatChar(String str) {
        int size = str.length();

        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 2);
                continue;
            }
            map.put(str.charAt(i),1);
        }
        for (int i = 0; i < size; i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

    /**
     * printing number of duplicate elements from given string
     * @param str
     */
    private static void printCountOfDuplicates(String str) {
        int size = str.length();
        int count = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 2);
                continue;
            }
            map.put(str.charAt(i),1);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                count++;
            }
        }
        System.out.println("Count of duplicates = " + count);

    }

    private static void printLengthOfSubstring(String str) {
        int size = str.length();
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 2);
                continue;
            }
            map.put(str.charAt(i),1);
        }
        System.out.println(map);
    }
}
