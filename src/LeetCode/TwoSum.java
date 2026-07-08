package LeetCode;

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans= new int[2];

//        USing Array
         for(int i=0;i<nums.length;i++){
             for(int j=i+1;j<nums.length;j++){
                 if((nums[i]+nums[j]==target)){
                     ans[0]=i;
                     ans[1]=j;
                 }
             }
         }

//         using Hashmap
        int n=nums.length;

        HashMap<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<n;i++){
            int partner= target-nums[i];
            if(mp.containsKey(partner)){
                ans= new int []{i,mp.get(partner)};
                return ans;
            }

            mp.put(nums[i],i);
        }
        return ans;

    }
}
