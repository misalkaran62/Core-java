import java.util.Scanner;

public class PerfactNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int num = 1; num <= n; num++) {
            int sum = 0;

            
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
