package javabasics.arrays.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int temp;
        boolean swapped;

        int[] arr = {0,6,2,1};

        int n = arr.length;
        
        for (int i = 0; i < n-1; i++) {
             swapped = false;

             for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                     // Swap arr[j] and arr[j+1]
                     temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                     swapped = true;
                }
             }

             if (!swapped) {
                break;
             }
        }

        System.out.println(Arrays.toString(arr));
    }
}
