import java.util.*;

public class Sixth {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        
        int reverse = generateReverse(N);
        System.out.println("Reverse of " + N + " is: " + reverse);
    }

    static int generateReverse(int number) {
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;

            
            if (!(reverse == 0 && digit == 0)) {
                reverse = reverse * 10 + digit;
            }

            number /= 10;
        }

        return reverse;
    }
}

