package Practice.Array;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr= {12,34,23,11,45,22,6,7,85,44,344};
        
        int largernumber = arr[0];
        
        for(int i=1;i< arr.length;i++){
           if(arr[i]>largernumber){
               largernumber=arr[i];
           }
        }

        int secondmost=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]!=largernumber && arr[i]>secondmost){
                secondmost=arr[i];
            }
        }

        System.out.println(largernumber);
        System.out.println(secondmost);
    }
}
