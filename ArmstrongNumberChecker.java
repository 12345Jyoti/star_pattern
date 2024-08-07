import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        // Call the isArmstrongNumber method and capture the result
        boolean result = isArmstrongNumber();

        // Print the result
        if (result) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }

    public static boolean isArmstrongNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        sc.close(); // Close the scanner to avoid resource leaks

        int dup = N;
        int sum = 0;

        while (N > 0) {
            int ld = N % 10;
            sum += ld * ld * ld;
            N /= 10;
        }

        // Return the result directly
        return dup == sum;
    }
}
