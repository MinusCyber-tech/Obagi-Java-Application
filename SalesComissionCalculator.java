
import java.util.Scanner;

public class SalesCommissionCalculator {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  double baseSalary = 200.0;
  double commissionRate = 0.09;
  double grossSales;

  System.out.print("Enter gross sales for the week (-1 to end): ");
  grossSales = scanner.nextDouble();

  while (grossSales != -1) {
   double earnings = baseSalary + commissionRate * grossSales;
   System.out.printf("Earnings: $%.2f\n", earnings);

   System.out.print("Enter gross sales for the week (-1 to end): ");
   grossSales = scanner.nextDouble();
  }
 }
}

