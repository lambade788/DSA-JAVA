package LeetCode;

public class Tribonacii1137 {

    class Solution {
        public int tribonacci(int n) {
            if(n==0){
                return 0;
            }
            else if(n==1 || n==2){
                return 1;
            }

            int first = 0;
            int second= 1;
            int third = 1;

            for(int i=1;i<=n;i++){
                int result = first +second + third;

                first = second;
                second = third;
                third = result;
            }

            return first;
        }
    }
}
