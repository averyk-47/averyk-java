public class tipCalculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter bill amount:");
        double billAmount = scanner.nextDouble();
        System.out.println("Enter tip percentage (e.g., 15 for 15%):");
        double tipPercentage = scanner.nextDouble();
        double tipAmount = billAmount * (tipPercentage / 100);
        double totalAmount = billAmount + tipAmount;
        System.out.printf("Tip Amount: %.2f\n", tipAmount);
        System.out.printf("Total Amount: %.2f\n", totalAmount);
        scanner.close();
    }
    
}
