package Linearbinary;

import java.util.Scanner;

public class linearsearchbinarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = {23, 12, 77, 13, 5, 3, 21};
        System.out.print("Enter the number: ");
        int target = sc.nextInt();

        int result = linearsearch(num, target);
//        int result2 = binarysearch(num,target);
        int result2 = binarysearch(num,target,0,num.length-1);

        if(result != -1)
            System.out.println("Element found at index: "+result);
        else
            System.out.println("Element not found.");
    }

    private static int binarysearch(int[] num, int target,int left,int right) {
//        int left=0;
//        int right= num.length-1;

//        recursive
        if(left <= right){
            int mid = (left + right)/2;
            if (num[mid] == target){
                return mid;
            } else if (num[mid] < target ) {
               return binarysearch(num, target, mid+1, right);
            }
            else
                return binarysearch(num, target,left,mid-1);
        }

        //normal
//        while(left <= right){
//            int mid = (left + right)/2;
//
//            if (num[mid] == target){
//                return mid;
//            } else if (num[mid] < target ) {
//                left = mid+1;
//            }
//            else
//                right = mid -1;
//        }


        return -1;
    }

    public static int linearsearch(int num[], int target) {
        for (int i = 0; i < num.length ; i++) {
            if (num[i] == target)
                   return i;
        }
        return -1;
    }
}