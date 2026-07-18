package Practice;


import java.util.Scanner;



public class Factorial {

    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        if(n<0){
            System.out.println("Factorial is not defined for negative number");
            return;
        }

        long factorial=1;

        for(int i=n;i>=1;i--){
            factorial*=i;
        }

        System.out.println(factorial);



//        Recursion
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println(factorial(n));
        }

        sc.close();
    }
}





//1. Why did you use long instead of int?
//
//Expected answer:
//
//        "int can store values only up to about 2.1 billion. Factorials grow very quickly, so long provides a much larger range."
//
//        2. What is the factorial of 0?
//
//Expected answer:
//
//        0! = 1 by mathematical definition.
//
//3. What is the time complexity?
//
//O(n)
//
//4. What is the space complexity?
//
//O(1)