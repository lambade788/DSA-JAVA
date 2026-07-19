package LeetCode;

//Example 1:
//
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]

class RemoveDuplicates {

    public static int removeDuplicates(int[] nums){

        int j=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }

        return j+1;
    }

    public static void main(String[] args) {

        int[] arr={1,2,2,3,4,5,5,6};

        removeDuplicates(arr);

        for(int i:arr){
            System.out.print(i+" ");
        }

    }
}
