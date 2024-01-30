import java.util.*;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        printFactors(number);
        sc.close();
    }

    static void printFactors(int number) {
        if (number <= 1) {
            System.out.println("Invalid input.");
            return;
        }

        System.out.print("Factors of " + number + '-');

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("-1");
        } else {
            System.out.println();
        }
    }

}
