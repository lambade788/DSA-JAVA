package Practice.Array;

public class SmallestElement {
    public static void main(String[] args) {
        int [] arr={12,34,1,56,63,23,33};

        int min =  arr[0];
        int index=0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                index=i;
            }
        }

        System.out.println("Smallest Elemnet is "+ min);
        System.out.println(index);

    }
}
