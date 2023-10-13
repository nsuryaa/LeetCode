import java.util.*;
class LongestCommonPrefix
{
    public static void main(String args[])
    {
        // String[] strs = {"flower","flow","flight"};
        // Arrays.sort(strs);
        // System.out.println(Arrays.toString(strs));
        String[] str = {"flower","flow","flight"};
        LongestCommonPrefix obj = new LongestCommonPrefix();
        String result = obj.longestCommonPrefix(str);
        System.out.println(result);

    }
    public String longestCommonPrefix(String[] str)
    {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        String first = str[0];
        String last = str[str.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++)
        {
            if(first.charAt(i)!=last.charAt(i))
            {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
        
    }
}