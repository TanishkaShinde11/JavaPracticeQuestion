import java.util.Scanner;

public class GoodPrimeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 2; i <= n; i++) {
            int primeFlag = 1;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primeFlag = 0;
                    break;
                }
            }

            if (primeFlag == 1) {
                int sum = 0, temp = i;
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }

                int sumPrimeFlag = 1;
                for (int k = 2; k < sum; k++) {
                    if (sum % k == 0) {
                        sumPrimeFlag = 0;
                        break;
                    }
                }

                if (sumPrimeFlag == 1) {
                    count++;
                }
            }
        }

        System.out.println("Count of good prime numbers from 1 to " + n + ": " + count);
    }
}
