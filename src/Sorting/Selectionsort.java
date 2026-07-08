package Sorting;

public class Selectionsort {
    public static void main(String[] args) {

        int[] num = {2, 7, 3, 8, 4, 6, 9, 5};  // input array
        int size = num.length;                 // size of array
        int temp;                              // for swapping
        int minIndex;                          // to store index of smallest element

        System.out.println("Before sorting array:");
        for (int nums : num) {                // print original array
            System.out.print(nums + " ");
        }

        System.out.println();

        // 🔥 SELECTION SORT STARTS
        for (int i = 0; i < size - 1; i++) {   // outer loop → position to fill

            minIndex = i;   // 🔥 assume current index has smallest value

            // 🔥 find minimum element in remaining array
            for (int j = i + 1; j < size; j++) {

                if (num[minIndex] > num[j]) {   // compare current min with next elements
                    minIndex = j;               // update minIndex if smaller element found
                }
            }

            // 🔥 swap smallest element with current position (i)
            temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;

            // print array after each pass
            for (int nums : num) {
                System.out.print(nums + " ");
            }
            System.out.println();
        }

        System.out.println("\nAfter sorting array:");
        for (int nums : num) {   // print sorted array
            System.out.print(nums + " ");
        }
    }
}