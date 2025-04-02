
import java.util.Scanner;

public class FindLargestNumber {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  int counter = 0;
  int number;
  int largest = Integer.MIN_VALUE; // Initialize with the smallest possible integer

  while (counter < 10) {
   System.out.print("Enter a number: ");
   number = scanner.nextInt();
   counter++;

   if (number > largest) {
    largest = number;
   }
  }

  System.out.println("The largest number is: " + largest);
 }
}

