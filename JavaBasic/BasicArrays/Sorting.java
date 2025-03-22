package JavaCoding.JavaBasic.BasicArrays;

import java.util.Arrays;
public class Sorting {
  
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};

        System.out.println();
        Arrays.sort(arr);  // Sorts the array
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 3);  // Finds element 3 in sorted array
        System.out.println("Index of 3: " + index);
    }
}
