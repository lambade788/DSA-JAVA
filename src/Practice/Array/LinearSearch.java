package Practice.Array;
//Write a Java program to search for an element in an array.
//
//If the element is found, print its index. Otherwise, print "Element not found."
//
//Example 1
//
//Input:
//
//Array = {12, 34, 23, 11, 45}
//Key = 23
//
//Output:
//
//Element found at index 2
public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {12,34,2,3,4,5,55,33,6};

        int target=34;
        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                System.out.println(i);
                found=true;
                break;
            }

        }
        if(!found){
            System.out.println("Element not found.");
        }

    }
}
