public class daysAndMinutes {
    //Calculates the number of days and minutes in a given number of years from input
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter number of years:");
        int years = scanner.nextInt();
        int days = years * 365;
        int minutes = days * 24 * 60;
        System.out.printf("%d years is approximately %d days or %d minutes.\n", years, days, minutes);
        scanner.close();
    }
   

}
