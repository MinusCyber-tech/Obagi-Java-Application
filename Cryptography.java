
import java.util.Scanner;

public class Cryptography {

 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter a four-digit integer to encrypt: ");
  int number = scanner.nextInt();

  // Encrypt the number
  int encryptedNumber = encrypt(number);
  System.out.println("Encrypted number: " + encryptedNumber);

  System.out.print("Enter a four-digit integer to decrypt: ");
  number = scanner.nextInt();

  // Decrypt the number
  int decryptedNumber = decrypt(number);
  System.out.println("Decrypted number: " + decryptedNumber);
 }

 public static int encrypt(int number) {
  int digit1 = number / 1000;
  int digit2 = (number % 1000) / 100;
  int digit3 = (number % 100) / 10;
  int digit4 = number % 10;

  digit1 = (digit1 + 7) % 10;
  digit2 = (digit2 + 7) % 10;
  digit3 = (digit3 + 7) % 10;
  digit4 = (digit4 + 7) % 10;

  return digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;
 }

 public static int decrypt(int number) {
  int digit1 = number / 1000;
  int digit2 = (number % 1000) / 100;
  int digit3 = (number % 100) / 10;
  int digit4 = number % 10;

  digit1 = (digit1 + 3) % 10; // Reverse the addition of 7
  digit2 = (digit2 + 3) % 10;
  digit3 = (digit3 + 3) % 10;
  digit4 = (digit4 + 3) % 10;

  return digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2; // Reverse the swap
 }
}

