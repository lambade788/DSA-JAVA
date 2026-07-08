package ARRAY;

public class sumofanarray {
    public static void main(String[] args) {
        int num[]={2,3,5,3,2,3};
        int sum=0;

        for(int i=0;i<num.length;i++){
            sum+=num[i];
        }

        System.out.println("Sum of an Array is: "+sum);
    }
}
