package HashMap;

//Given an array of integers, find the element that occurs most frequently in the array.
//If multiple elements have the same maximum frequency, print any one of them.

import java.util.HashMap;
import java.util.Map;

public class questionone {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,4,5,1,3,4,6,2,1,2,1,1,1,2,2,2,2,2};

        Map<Integer,Integer> fre =new HashMap<>();

        for(int e:arr){
            if (!fre.containsKey(e)) {
                fre.put(e,1);
            }
            else{
                fre.put(e,fre.get(e)+1);
            }
        }

        System.out.println(fre.entrySet());

        int maxVAl=0;
        int anskey=-1;
        for(var e:fre.entrySet()){
            if(maxVAl < e.getValue()){
                maxVAl = e.getValue();
                anskey = e.getKey();
            }
        }

        System.out.println(anskey);
    }
}
