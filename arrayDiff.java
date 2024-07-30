import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class arrayDiff {

  public static int[] arrayDiffS1(int[] a, int[] b) {
    List<Integer> resultList = new ArrayList<>();

    for (int i = 0; i < a.length; i++) {
      boolean found = false;
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          found = true;
          break;
        }
      }
      if (!found) {
        resultList.add(a[i]);
      }
    }

    // Convert the resultList to an array
    int[] result = new int[resultList.size()];
    for (int i = 0; i < resultList.size(); i++) {
      result[i] = resultList.get(i);
    }

    return result;
  }

  public static int[] arrayDiffS2(int[] a, int[] b) {
    List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
    List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
    listA.removeAll(listB);
    return listA.stream().mapToInt(e -> e).toArray();
}

public static int[] arrayDiffS3(int[] a, int[] b) {
    return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
  }

  public static String arrayToString(int[] array) {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < array.length; i++) {
      sb.append(array[i]);
      if (i < array.length - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }

 
public static void main(String[] args) {
int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
int[] b = new int[]{1,3,5,7,9};
    System.out.println(arrayToString(arrayDiffS1(a, b)));
    System.out.println(arrayToString(arrayDiffS2(a, b)));
    System.out.println(arrayToString(arrayDiffS3(a, b)));
}
}
