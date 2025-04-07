import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many numbers you will input: ");
        int count = input.nextInt();

        System.out.print("Enter number 1: ");
        int smallest = input.nextInt();

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }

        System.out.println("The smallest value is: " + smallest);
    }
}