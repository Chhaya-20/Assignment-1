import java.util.*;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer 'n': ");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            n /= 10;
        }
        sc.close();
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}
