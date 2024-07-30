import java.util.Arrays;

public class FindOutlier {
    public static int find(int[] integers) {
        int evenCount = 0;
        int oddCount = 0;
        int lastEven = 0;
        int lastOdd = 0;

        // Determinar si el array es mayormente par o impar
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                evenCount++;
                lastEven = integers[i];
            } else {
                oddCount++;
                lastOdd = integers[i];
            }
        }

        boolean majorityEven = evenCount > oddCount;

        // Buscar el "outlier"
        for (int i = 0; i < integers.length; i++) {
            if ((integers[i] % 2 == 0 && !majorityEven) || (integers[i] % 2 != 0 && majorityEven)) {
                return integers[i];
            }
        }

        // Esto no debería ocurrir si el array contiene exactamente un "outlier"
        return 0;

    }


    static int find2(int[] integers) {
        int oddcount = 0, odd = 0, evencount = 0, even = 0;
        for (int i : integers) {
            if (i % 2 == 0) {
                even = i;
                evencount++;
            } else {
                odd = i;
                oddcount++;
            }
            if (evencount > 0 && oddcount > 0) {
                if (evencount > 1) {
                    return odd;
                } else if (oddcount > 1) {
                    return even;
                }
            }
        }
        return evencount > 1 ? odd : even;
    }
 static int find3(int[] integers){
    int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
    int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();

    return odd.length == 1 ? odd[0] : even[0];
}
    public static void main(String[] args) {
        int[] arr = {2, 4, 0, 100, 4, 11, 2602, 36,54948,12655,6984984,2164987,231213216};

        System.out.println(find(arr));
        System.out.println(find2(arr));
        System.out.println(find3(arr));
    }
}
