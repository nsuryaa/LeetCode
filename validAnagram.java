class Solution {
    public boolean isAnagram(String s, String t) {
        char array1[] = s.toCharArray();
        Arrays.sort(array1);
        char array2[] = t.toCharArray();
        Arrays.sort(array2);
        return Arrays.equals(array1,array2);
    }
}