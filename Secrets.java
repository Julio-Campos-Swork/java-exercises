/*
 * 
 * FULL EXCERSICE https://exercism.org/tracks/java/exercises/secrets
 */

public class Secrets {
    public static int shiftBack(int value, int amount) {
       return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        return mask | value;
    }

    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }

    public static void main(String[] args) {
        System.out.println(Secrets.shiftBack(0b1001, 2)); //# => 0b0010
        System.out.println(Secrets.setBits(0b0110, 0b0101)); //# => 0b0111
        System.out.println(Secrets.flipBits(0b1100, 0b0101)); //# => 0b1001
        System.out.println(Secrets.clearBits(0b0110, 0b0101)); //# => 0b0010
        
    }
}
