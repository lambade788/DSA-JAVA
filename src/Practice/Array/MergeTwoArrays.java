package Practice.Array;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1,2,6, 7, 8, 9, 10};

        int[] merged = new int[arr1.length + arr2.length];

        // Copy first array
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy second array
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.print("Merged Array: ");

        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}