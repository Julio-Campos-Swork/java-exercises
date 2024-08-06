
/*
 * Instructions
In this exercise you will implement a partial set of utility routines to help a developer clean up SqueakyClean names.

In the 4 tasks you will gradually build up the clean method. A valid SqueakyClean name is comprised of zero or more letters and underscores.

In all cases the input string is guaranteed to be non-null. Note that the clean method should treat an empty string as valid.
 * 
 * FULL INFORMATION
 * https://exercism.org/tracks/java/exercises/squeaky-clean
 */

public class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder result = new StringBuilder();
        boolean toUpperCase = false;

        for (char c : identifier.toCharArray()) {
            if (c == '-') {
                toUpperCase = true;
            } else {
                if (toUpperCase) {
                    result.append(Character.toUpperCase(c));
                    toUpperCase = false;
                } else {
                    result.append(c);
                }
            }
        }

       return result.toString()
       .replaceAll(" ", "_")
       .replaceAll("4", "a")
       .replaceAll("3", "e")
       .replaceAll("0", "o") 
       .replaceAll("1", "l") 
       .replaceAll("7", "t") 
       .replaceAll("[^a-zA-Z_]", "");
    }

    public static void main(String[] args) {
        System.out.println(SqueakyClean.clean("my   Id")); // => "Hello_World"
        System.out.println(SqueakyClean.clean("a-bc")); // => "aBc"
        System.out.println(SqueakyClean.clean("H3ll0 W0rld")); // => "Hello_World"
        System.out.println(SqueakyClean.clean("a$#.b")); // => "ab"

    }
}
