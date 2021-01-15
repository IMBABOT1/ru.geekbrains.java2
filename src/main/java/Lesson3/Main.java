package Lesson3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {

    private static String[] arr = new String[]{"a","a","b","d","a","c","d","f","e","g","g","k","l","l", "c"};

    private static TreeSet uniqueWords(String[]arr){
        TreeSet<String> set = new TreeSet<>(Arrays.asList(arr));
        return set;
    }

    private static HashMap<String, Integer> wordCount(String[]arr){
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            if (!(map.containsKey(arr[i]))) {
                map.put(arr[i], 1);
            }else if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(uniqueWords(arr));
        System.out.println(wordCount(arr));
    }
}
