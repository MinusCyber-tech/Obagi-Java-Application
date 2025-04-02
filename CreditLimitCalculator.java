
import java.util.Scanner;

public class CreditLimitCalculator {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  int accountNumber;
  int beginningBalance;
  int charges;
  int credits;
  int creditLimit;

  System.out.print("Enter account number (-1 to quit): ");
  accountNumber = scanner.nextInt();

  while (accountNumber != -1) {
   System.out.print("Enter beginning balance: ");
   beginningBalance = scanner.nextInt();

   System.out.print("Enter total charges: ");
   charges = scanner.nextInt();

   System.out.print("Enter total credits: ");
   credits = scanner.nextInt();

   System.out.print("Enter credit limit: ");
   creditLimit = scanner.nextInt();

   int newBalance = beginningBalance + charges - credits;
   System.out.println("New balance: " + newBalance);

   if (newBalance > creditLimit) {
    System.out.println("Credit limit exceeded");
   }

   System.out.print("
Enter account number (-1 to quit): ");
   accountNumber = scanner.nextInt();
  }
 }
}

