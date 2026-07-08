package ARRAY;

import java.util.Scanner;

public class findX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = {23, 34, 54, 34, 11, 89};
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        boolean found = false; // start with false

        for (int i = 0; i < num.length; i++) {
            if (x == num[i]) {
                System.out.println(x + " Number is on " + i + " Index");
                found = true;
                break; // only break when found
            }
        }

        if (!found) {
            System.out.println("Number is not available in the array");
        }

        sc.close();
    }
}