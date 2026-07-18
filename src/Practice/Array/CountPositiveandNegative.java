package Practice.Array;

public class CountPositiveandNegative {
    public static void main(String[] args) {
        int[] num = {23, -34, 54, 34, -11, 89};

        int p=0;
        int n=0;

        for(int i:num){
            if(i>=0){
                p++;
            }
            else {
                n++;
            }
        }

        System.out.println(p);
        System.out.println(n);
    }
}
