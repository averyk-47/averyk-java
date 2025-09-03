public class TemperatureConverter {
    //Takes the temperature from a User Input in Fahrenheit and converts it to Celsius
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);
        scanner.close();
    }
    }
