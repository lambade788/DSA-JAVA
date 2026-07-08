package Sorting;  // package name (just for organizing files)

public class Bubblesort {

    public static void main(String[] args) {

        int[] num = {2, 7, 3, 8, 4, 6, 9, 5};  // input array
        int size = num.length;                // total number of elements
        int temp = 0;                         // temporary variable for swapping

        // PRINT ORIGINAL ARRAY
        System.out.println("Before sorting array:");
        for (int nums : num) {               // loop through each element
            System.out.print(nums + " ");
        }

        System.out.println();

        // 🔥 MAIN BUBBLE SORT LOGIC STARTS HERE
        for (int i = 0; i < size; i++) {     // OUTER LOOP → number of passes

            // After every pass, largest element goes to the end
            // So we reduce comparisons using (size - i - 1)
            for (int j = 0; j < size - i - 1; j++) {   // INNER LOOP → comparisons

                // 🔥 LOGIC: compare adjacent elements
                if (num[j] > num[j + 1]) {

                    // 🔥 SWAPPING LOGIC
                    temp = num[j];           // store current element
                    num[j] = num[j + 1];    // move next element to current
                    num[j + 1] = temp;      // place stored value to next
                }
            }

            // PRINT ARRAY AFTER EACH PASS (for understanding)
            for (int nums : num) {
                System.out.print(nums + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("After sorting array: ");

        // FINAL SORTED ARRAY
        for (int nums : num) {
            System.out.print(nums + " ");
        }
    }
}