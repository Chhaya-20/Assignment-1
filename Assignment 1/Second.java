import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start Fahrenheit value (S): ");
        double startFahrenheit = scanner.nextDouble();

        System.out.print("Enter end Fahrenheit value (E): ");
        double endFahrenheit = scanner.nextDouble();

        System.out.print("Enter step size (W): ");
        double stepSize = scanner.nextDouble();

        System.out.println("Fahrenheit\tCelsius");

        for (double fahrenheit = startFahrenheit; fahrenheit <= endFahrenheit; fahrenheit += stepSize) {
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f\t\t%.2f\n", fahrenheit, celsius);
        }
        scanner.close();
    }

    // Convert Fahrenheit to Celsius
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
