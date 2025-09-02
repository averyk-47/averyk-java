import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        System.out.println("Input the dollar amount in pennies:");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();
        int quarters = pennies / 25;
        pennies = pennies % 25;
        int dimes = pennies / 10;
        pennies = pennies % 10;
        int nickels = pennies / 5;
        pennies = pennies % 5;
        int cents = pennies;
        System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, and " + cents + " cents.");
        scanner.close();
    }
}
