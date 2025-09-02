import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
      //User inputs the radius for the blue, red, and yallow circles
      Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the radius of the blue circle:");
        double blueRadius = scanner.nextDouble();
        System.out.println("Enter the radius of the red circle:");
        double redRadius = scanner.nextDouble();
        System.out.println("Enter the radius of the yellow circle:");
        double yellowRadius = scanner.nextDouble();
        scanner.close();

        //Calculates the area of each circle when give radius in inches and converts to square feet
        double blueArea = Math.PI * Math.pow(blueRadius, 2);
        double redArea = Math.PI * Math.pow(redRadius, 2);
        double yellowArea = Math.PI * Math.pow(yellowRadius, 2);
        blueArea = blueArea / 144;
        redArea = redArea / 144;
        yellowArea = yellowArea / 144;
        System.out.printf("The area of the blue circle is %.2f square feet.%n", blueArea);
        System.out.printf("The area of the red circle is %.2f square feet.%n", redArea);
        System.out.printf("The area of the yellow circle is %.2f square feet.%n", yellowArea);

        //Subtracts the area of the smaller circles from the larger circles to get the area of each color
        double bluePaintArea = blueArea - yellowArea;
        double yellowPaintArea = yellowArea - redArea;
        double redPaintArea = redArea;

        //One gallon of paint covers 2 square feet
        double bluePaintGallons = bluePaintArea / 2;
        double yellowPaintGallons = yellowPaintArea / 2;
        double redPaintGallons = redPaintArea / 2;
        System.out.printf("You will need %.2f gallons of blue paint.%n", bluePaintGallons);
        System.out.printf("You will need %.2f gallons of yellow paint.%n", yellowPaintGallons);
        System.out.printf("You will need %.2f gallons of red paint.%n", redPaintGallons);

        //Tells the user the square footage of each color
        System.out.printf("The area to be painted blue is %.2f square feet.%n", bluePaintArea);
        System.out.printf("The area to be painted yellow is %.2f square feet.%n", yellowPaintArea);
        System.out.printf("The area to be painted red is %.2f square feet.%n", redPaintArea);

        //Calculates labor cost at $7 per hour, Blue paint costs $4.50 per gallon, Yellow paint costs $4.20 per gallon, and Red paint costs $3.50 per gallon
        double totalPaintGallons = bluePaintGallons + yellowPaintGallons + redPaintGallons;
        double laborHours = totalPaintGallons * 8;
        double laborCost = laborHours * 7;
        double paintCost = (bluePaintGallons * 4.50) + (yellowPaintGallons * 4.20) + (redPaintGallons * 3.50);
        double totalCost = laborCost + paintCost;
        System.out.printf("The total cost of paint is $%.2f.%n", paintCost);
        System.out.printf("The total cost of labor is $%.2f.%n", laborCost);
        System.out.printf("The total cost of the paint job is $%.2f.%n", totalCost);

        //It also takes 1 hour to paint 0.5 gallons of paint
        System.out.printf("The total hours of labor required is %.2f hours.%n", laborHours);

    
    }
}
