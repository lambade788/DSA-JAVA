package Practice.Array;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        int first=arr[0];

        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }

        arr[arr.length-1]=first;

        System.out.print("Array after left rotation: ");
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
