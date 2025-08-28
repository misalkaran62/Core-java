import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        // Count digits
        int digits = 0, temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        // Armstrong calculation
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int)Math.pow(digit, digits);  // short logic
            temp /= 10;
        }

        // Final result with ternary
        System.out.println(original + (sum == original ? " is an Armstrong number." : " is NOT an Armstrong number."));

        sc.close();
    }
}
