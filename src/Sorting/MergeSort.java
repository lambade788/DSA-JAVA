package Sorting;

public class MergeSort {

    public static void mergesort(int[] arr, int l, int r) {
        if (l < r) {   // 🔥 Base condition: divide until single element

            int mid = l + (r - l) / 2;   // 🔥 Find middle index

            mergesort(arr, l, mid);      // 🔥 Divide left part
            mergesort(arr, mid + 1, r);  // 🔥 Divide right part

            merge(arr, l, mid, r);       // 🔥 Merge sorted halves
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1;   // size of left subarray
        int n2 = r - mid;       // size of right subarray

        int[] larr = new int[n1];   // temp array for left
        int[] rarr = new int[n2];   // temp array for right

        // 🔥 Copy left part from original array
        for (int i = 0; i < n1; i++) {
            larr[i] = arr[l + i];
        }

        // 🔥 Copy right part from original array
        for (int j = 0; j < n2; j++) {
            rarr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;   // pointers

        // 🔥 MAIN MERGE LOGIC
        while (i < n1 && j < n2) {

            // Compare elements and place smaller one in original array
            if (larr[i] <= rarr[j]) {
                arr[k++] = larr[i++];   // take from left
            } else {
                arr[k++] = rarr[j++];   // take from right
            }
        }

        // 🔥 Copy remaining elements from left array (if any)
        while (i < n1) {
            arr[k++] = larr[i++];
        }

        // 🔥 Copy remaining elements from right array (if any)
        while (j < n2) {
            arr[k++] = rarr[j++];
        }
    }

    public static void main(String[] args) {
        int [] arr= {3, 5, 2, 7, 4, 1, 6};

        mergesort(arr, 0, arr.length - 1);   // 🔥 Start sorting

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}