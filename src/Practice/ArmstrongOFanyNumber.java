package Practice;

import java.util.Scanner;

public class ArmstrongOFanyNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        int original = n;

        // Count number of digits
        int digits = 0;
        int temp = n;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        // Calculate Armstrong sum
        int sum = 0;
        temp = n;

        while (temp > 0) {
            int digit = temp % 10;

            sum = sum + (int) Math.pow(digit, digits);

            temp = temp / 10;
        }

        // Check
        if (original == sum) {
            System.out.println("It is Armstrong");
        } else {
            System.out.println("It is not Armstrong");
        }
    }
}