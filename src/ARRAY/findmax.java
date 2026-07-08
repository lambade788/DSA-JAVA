package ARRAY;

public class findmax {
    public static void main(String[] args) {
        int num[] = {23, 34, 54, 34, 11, 89,33,45,55,99};
        int max=Integer.MIN_VALUE;

//        for(int i=0;i<num.length;i++){
//            for(int j=0;j<num.length-i-1;j++){
//                if(num[j] > num[j+1]) {
//                    max = num[j];
//                    num[j] = num[j + 1];
//                    num[j + 1] = max;
//                }
//            }
//        }

        for(int i = 1; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }

        int secondmax=Integer.MIN_VALUE;
        for(int i = 1; i < num.length; i++){
            if(num[i] > secondmax && num[i]!=max){
                secondmax = num[i];
            }
        }

//        for(int nums:num){
//            System.out.print(nums+" ");
//        }

        System.out.println();
        System.out.println("Maximun number is: "+max);
        System.out.println("Second maximun number is: "+secondmax);

    }
}
