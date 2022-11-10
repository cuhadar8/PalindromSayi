import java.util.Scanner;

public class Main {
	
	 static boolean isPalindrom(int number) {
	        int temp = number, reverseNumber = 0, lastDigit;

	        while (temp != 0) {
	            lastDigit = temp % 10;
	            reverseNumber = (reverseNumber * 10) + lastDigit;
	            temp /= 10;
	        }
	        if (number == reverseNumber) {
	            System.out.println("Palindrom sayıdır.");
	            return true;
	        } 
	        else {
	            System.out.println("Palindrom sayı değildir.");
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Bir sayı girin: ");
	        int n = scanner.nextInt();
	        System.out.println(isPalindrom(n));

	    }
}
