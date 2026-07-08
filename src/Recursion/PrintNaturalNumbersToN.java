package Recursion;

import java.util.Scanner;

public class PrintNaturalNumbersToN {

    static void printdecreasing(int n){

        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printdecreasing(n-1);
    }

    static void printnumberIncreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        printnumberIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

//        printnumberIncreasing(n);

        printdecreasing(n);

    }
}
