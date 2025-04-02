
import java.util.Scanner;

public class FindTwoLargestNumbers {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  int counter = 0;
  int number;
  int largest = Integer.MIN_VALUE;
  int secondLargest = Integer.MIN_VALUE;

  while (counter < 10) {
   System.out.print("Enter a number: ");
   number = scanner.nextInt();
   counter++;

   if (number > largest) {
    secondLargest = largest;
    largest = number;
   } else if (number > secondLargest) {
    secondLargest = number;
   }
  }

  System.out.println("The largest number is: " + largest);
  System.out.println("The second largest number is: " + secondLargest);
 }
}

