
/*
 * Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 * 
 */

import java.util.Arrays;

public class ShortestWord {
    

    public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortest = Integer.MAX_VALUE;
        for (String word : words) {
            shortest = Math.min(shortest, word.length());
        }
        return shortest;
    }
    public static int findShort2(String s) {
      return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps")); //2
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones")); //3
        System.out.println(findShort("Let's travel abroad shall we")); //2
    }
}
