import java.util.*;
class Solution {
  public static void main(String[] args) {
    boolean result=isAnagram("surya","ayrus");
    System.out.println(result);
  }
    public static boolean isAnagram(String s, String t) {
        char array1[] = s.toCharArray();
        Arrays.sort(array1);
        char array2[] = t.toCharArray();
        Arrays.sort(array2);
        if(array1 == array2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}