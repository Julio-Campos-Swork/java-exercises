/*
 * 
 * Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.

Constraint:

1 <= month <= 12
 */



public class QuaterOfTheYear {
    public static int quarterOf(int month) {
        if(month <= 3) return 1;
        if(month <= 6 && month >=4) return 2;
        if(month <= 9 && month >=6) return 3;
        if(month <= 12 && month >=9) return 4;
        return 0;
    }

    public static int quarterOf2(int month) {
        return (int) Math.ceil(month / 3.);
    }

    public static void main(String[] args) {
      System.out.println(quarterOf(3));
      System.out.println(quarterOf(8));
      System.out.println(quarterOf(11));
    }
}
