import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;
        System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);
        System.out.printf("Temperatura em Fahrenheit: %.2f°F\n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2fK\n", kelvin);
        scanner.close();
    }
}