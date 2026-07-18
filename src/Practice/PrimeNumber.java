package Practice;


import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        boolean isprime = true;

        if(n<=1) {
            isprime = false;
        }
            else{
                for(int i=2;i<Math.sqrt(n);i++){
                    if(n%i==0){
                        isprime=false;
                        break;
                    }
            }
        }


            if(isprime){
                System.out.println("Prime number");
            }
            else{
                System.out.println("Its Not prime number.");
            }

        sc.close();
    }
}
