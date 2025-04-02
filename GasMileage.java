3.17 (Gas Mileage)
import java.util.Scanner;

public class GasMileage {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  int miles;
  int gallons;
  double milesPerGallon;
  double totalMiles = 0;
  double totalGallons = 0;

  while (true) {
   System.out.print("Enter miles driven (-1 to quit): ");
   miles = scanner.nextInt();

   if (miles == -1) {
    break; // Sentinel value to end loop
   }

   System.out.print("Enter gallons used: ");
   gallons = scanner.nextInt();

   milesPerGallon = (double) miles / gallons; // Calculate MPG
   System.out.printf("Miles per gallon for this trip: %.2f\n", milesPerGallon);

   totalMiles += miles;
   totalGallons += gallons;
  }

  if (totalGallons != 0) {
   double combinedMPG = totalMiles / totalGallons;
   System.out.printf("
Combined miles per gallon: %.2f\n", combinedMPG);
  } else {
   System.out.println("No trips entered.");
  }
 }
}

