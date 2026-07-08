package ARRAY;

public class movezeroes {
    public static void main(String[] args) {
        int[] nums={0,1,2,0,3,5};


        int[] arr=new int[nums.length];
        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) {
                arr[index] = nums[i];
                index++;
            }
        }
//        for(int i=0;i<nums.length;i++){
//            nums[i]=arr[i];
//        }

        for(int n:arr){
            System.out.print(n+" ");
    }
  }
}
