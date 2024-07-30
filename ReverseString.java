/*
 * Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'
 */

public class ReverseString {
    public static String solution(String str) {
        String[] array = str.split("");
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
          result += array[i];
        }
        return result;
      }

      public static void main(String[] args) {
        System.out.println(solution("world"));
      }
}
