package Practice;

import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s= sc.nextLine();

        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i)+" ");
        }

    }
}
