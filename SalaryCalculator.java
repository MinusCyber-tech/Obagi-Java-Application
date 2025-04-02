
import java.util.Scanner;

public class SalaryCalculator {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  for (int i = 1; i <= 3; i++) {
   System.out.print("Enter hours worked for employee " + i + ": ");
   double hours = scanner.nextDouble();

   System.out.print("Enter hourly rate for employee " + i + ": ");
   double rate = scanner.nextDouble();

   double grossPay;
   if (hours <= 40) {
    grossPay = hours * rate;
   } else {
    grossPay = 40 * rate + (hours - 40) * rate * 1.5;
   }

   System.out.printf("Gross pay for employee %d: $%.2f\n", i, grossPay);
  }
 }
}

