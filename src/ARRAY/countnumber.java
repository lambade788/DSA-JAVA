package ARRAY;

public class countnumber {
    public static void main(String[] args) {

        int num[] = {23, 34, 54, 34, 11, 89, 33, 45, 55, 99};

        int count = 0;
        int x = 11;

        // First pass → count numbers greater than x
        for (int i = 0; i < num.length; i++) {
            if (num[i] > x) {
                count++;
            }
        }

        // Create array of exact size
        int result[] = new int[count];

        // Second pass → store only valid numbers
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > x) {
                result[j] = num[i];
                j++;
            }
        }

        System.out.println("There are " + count + " numbers greater than " + x);
        System.out.println("Numbers are: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}