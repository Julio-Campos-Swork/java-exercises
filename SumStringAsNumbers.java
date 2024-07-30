/*
 * Given the string representations of two integers, return the string representation of the sum of those integers.

For example:

sumStrings('1','2') // => '3'
A string representation of an integer will contain no characters besides the ten numerals "0" to "9".

I have removed the use of BigInteger and BigDecimal in java
 */

import java.math.BigInteger;

public class SumStringAsNumbers {

    public static String sumStrings(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger result = numA.add(numB);

        return result.toString();
    }

    public static String sumStrings2(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int aLength = a.length();
        int bLength = b.length();

        // Sumamos desde el último dígito hasta el primero
        for (int i = 0; i < aLength; i++) {
            int digitA = a.charAt(aLength - 1 - i) - '0';
            int digitB = i < bLength ? b.charAt(bLength - 1 - i) - '0' : 0;

            int sum = digitA + digitB + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }

        // Si queda un carry al final, lo agregamos
        if (carry != 0) {
            result.append(carry);
        }
        if(result.charAt(result.length()-1)=='0' ){
        result.deleteCharAt(result.length()-1);
        }
        if(result.charAt(result.length()-1)=='0' ){
        result.deleteCharAt(result.length()-1);
        }

        // Invertimos el resultado porque lo hemos construido al revés
        return result.reverse().toString();

    }

    public static void main(String[] args) {
        System.out.println(sumStrings("123", "456"));
        System.out.println(sumStrings("655052871410422411373", "655052871410422411373"));
        System.out.println(sumStrings2("123", "456"));
        System.out.println(sumStrings2("06116502060104075165", "643345"));
    }
}
