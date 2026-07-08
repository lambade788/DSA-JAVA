package ARRAY;

import java.util.Scanner;

public class finddoublet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {2,5,3,6,7,8,1,4};
        System.out.print("Enter the number: ");
        int x=sc.nextInt();

        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if((num[i]+num[j]==x))
                    System.out.println(num[i]+" + "+num[j]+" = "+x);
            }
        }
    }
}
