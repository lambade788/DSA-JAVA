package Sorting;

public class Insertionsort {
    public static void main(String[] args) {
        int arr[] = {3,5,2,7,4,1,6};  // Input array

        System.out.println("Before sorting array:");
        for(int nums:arr){   // Loop to print original array
            System.out.print(nums+" ");
        }

        // 🔥 INSERTION SORT STARTS
        for(int i=1;i<arr.length;i++){   // Outer loop → picks elements one by one

            int key=arr[i];   // Current element we want to place correctly
            int j = i-1;      // Compare with previous elements

            // 🔥 MAIN LOGIC: shift elements greater than key to right
            while(j>=0 && arr[j] > key){
                arr[j+1]=arr[j];   // Shift element one position right
                j--;               // Move left
            }

            // 🔥 Insert key at correct position
            arr[j+1]=key;
        }

        System.out.println();
        System.out.println("Before sorting array:"); // (label mistake but kept same as you asked)

        for(int nums:arr){   // Print sorted array
            System.out.print(nums+" ");
        }
    }
}