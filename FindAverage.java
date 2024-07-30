/*
 * Write a function which calculates the average of the numbers in a given list.

Note: Empty arrays should return 0.
 */

import java.util.Arrays;

public class FindAverage {
    public static double find_average(int[] array){
    if(array.length == 0){
        return 0;
    }
    double sum = 0;
    for(int i = 0; i < array.length; i++){
        sum += array[i];
    }
        return sum / array.length;
    }
    public static double find_average2(int[] array){
    return Arrays.stream(array).average().orElse(0);
    }

    public static void main(String[] args) {
        
        System.out.println(find_average(new int[] {1,1,1}));
        System.out.println(find_average(new int[] {1,2,3}));
        System.out.println(find_average2(new int[] {1,1,1}));
        System.out.println(find_average2(new int[] {1,2,3,4,5,6,7,8,9}));
    }
}
