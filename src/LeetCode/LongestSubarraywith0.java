package LeetCode;

import java.util.HashMap;

public class LongestSubarraywith0 {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();

        int prefix=0;
        int maxlen=0;
        mp.put(0,-1);
        for(int i=0;i<arr.length;i++){
            prefix += arr[i];

            if(mp.containsKey(prefix)){
                maxlen=Math.max(maxlen,i-mp.get(prefix));
            }
            else{
                mp.put(prefix,i);
            }
        }
        return maxlen;
    }
}
