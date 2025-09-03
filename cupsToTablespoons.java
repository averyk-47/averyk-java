public class cupsToTablespoons {
    //Takes the volume from a User Input in Cups and converts it to Tablespoons
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter volume in Cups:");
        double cups = scanner.nextDouble();
        double tablespoons = cups * 16;
        System.out.printf("Volume in Tablespoons: %.2f\n", tablespoons);
        scanner.close();
    }
    
}
