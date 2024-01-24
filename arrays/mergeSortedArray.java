import java.util.Arrays;

class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int lenSortedArray = m + n;

        int[] sortedArray = new int[lenSortedArray];

        System.arraycopy(nums1, 0, sortedArray, 0, m);
        System.arraycopy(nums2, 0, sortedArray, m, n);
        Arrays.sort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static void main(String[] args) {

        mergeSortedArray merger = new mergeSortedArray();
        // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        // int m = 3;

        // int[] nums2 = { 2, 5, 6 };
        // int n = 3;

        int[] nums1 = { 0 };
        int m = 0;

        int[] nums2 = { 1 };
        int n = 1;
        merger.merge(nums1, m, nums2, n);
    }
}

// System.arraycopy(Object src, int srcPos, Object dest, int destPos, int
// length)

// The System.arraycopy method in Java is used to efficiently copy data from one
// array to another. Its signature is as follows:

// java
// Copy code
// System.arraycopy(Object src, int srcPos, Object dest, int destPos, int
// length)
// src: The source array from which elements are to be copied.
// srcPos: The starting position in the source array from which to start
// copying.
// dest: The destination array where elements are to be copied.
// destPos: The starting position in the destination array where elements are to
// be copied.
// length: The number of elements to be copied.

// src : leetcode