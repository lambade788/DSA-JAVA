package Practice.Array;

public class CountEvenandOdd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,45,34,23,11};

        int oddcount=0;
        int evencount=0;



        for(int i:arr){
            if(i%2==0){
                evencount++;
            }
            else {
                oddcount++;
            }
        }

        System.out.println("Odd number count is: "+oddcount);
        System.out.println("Even number count is: "+evencount);


    }
}
