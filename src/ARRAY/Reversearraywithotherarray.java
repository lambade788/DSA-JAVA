package ARRAY;

public class Reversearraywithotherarray {
    public static void main(String[] args) {
        int num[] = {23, 34, 54, 34, 11, 89,33,45,55,99};

        int[] reverse = new int[num.length];

        int j=0;
        for(int i=num.length-1;i >= 0;i--){
            reverse[j] = num[i];
            j++;
        }

        for(int nums:reverse){
            System.out.print(nums+" ");
        }
    }
}
