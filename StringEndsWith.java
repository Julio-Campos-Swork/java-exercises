public class StringEndsWith {


    public static boolean solution(String str, String ending) {

          if(str.endsWith(ending)){
            return true;
          }


        return false;
      }

      public static void main(String[] args) {
        System.out.println(solution("abc", "bc"));
    
      }

}
