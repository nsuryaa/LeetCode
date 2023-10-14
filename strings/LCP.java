import java.util.*;
class LCP {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }

}




//     public String longestCommonPrefix(String[] strs) {
//         if (strs == null || strs.length == 0)
//             return "";
        
//         Arrays.sort(strs);
//         String first = strs[0];
//         String last = strs[strs.length - 1];
//         int c = 0;
//         while(c < first.length())
//         {
//             if (first.charAt(c) == last.charAt(c))
//                 c++;
//             else
//                 break;
//         }
//         return c == 0 ? "" : first.substring(0, c);
//     }
// }