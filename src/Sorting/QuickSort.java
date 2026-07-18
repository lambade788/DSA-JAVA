package Sorting;

public class QuickSort {

    public static void quicksort(int[] num,int low,int high) {
        if(low < high){   // 🔥 Base condition: sort only if more than 1 element

            int pi = partition(num, low, high);  // 🔥 Find correct position of pivot

            quicksort(num, low, pi-1);   // 🔥 Sort left part (smaller elements)
            quicksort(num, pi+1, high);  // 🔥 Sort right part (greater elements)
        }
    }
    private static int partition(int[] num, int low, int high) {

        int pivot = num[high];   // 🔥 Choose last element as pivot
        int i = low - 1;         // 🔥 Pointer for smaller elements

        // 🔥 Traverse array and rearrange elements
        for(int j = low; j < high; j++){

            // 🔥 MAIN LOGIC: if current element < pivot
            if(num[j] < pivot){
                i++;   // move boundary of smaller elements

                // 🔥 Swap num[i] and num[j]
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }

        // 🔥 Place pivot at correct position
        int temp = num[i+1];
        num[i+1] = num[high];
        num[high] = temp;

        return i+1;   // 🔥 Return pivot index
    }

    public static void main(String[] args) {
        int[] num = {7,2,3,6,1,8,4,5,9};

        quicksort(num,0,num.length-1);   // 🔥 Start sorting

        for(int n:num){   // Print sorted array
            System.out.print(n+" ");
        }
    }
}