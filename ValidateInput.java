
import java.util.Scanner;

public class ValidateInput {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int input;

  do {
   System.out.print("Enter 1 or 2: ");
   input = scanner.nextInt();
  } while (input != 1 && input != 2);

  System.out.println("You entered: " + input);
 }
}

