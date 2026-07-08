package ARRAY;

public class MaximunSubarray {
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};

//        method1
        int sum = 0;
        int max = nums[0];

        for(int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if(sum > max) {
                max = sum;
            }

            if(sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);


        //method2

        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);

            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}
