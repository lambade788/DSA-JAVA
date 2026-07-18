package Practice.Array;

public class CheckifanArrayisSorted {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,45,34,23,11};

        boolean isSorted = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}