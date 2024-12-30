import java.util.Scanner;

public class armstrong {
	public static void main(String[] args) {
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		int originalNumber = sc.nextInt();
		int temp1 = originalNumber;
		int temp2 =originalNumber;
		int result = 0;
		int length = 0;
		while (temp1 != 0) {
			length++;
			temp1/=10;
		}
		while (temp2 != 0) {
			
			int reminder = temp2 % 10;
			result += Math.pow(reminder, length);
			temp2 /= 10;
		}
		
		if (result == originalNumber) {
			System.out.println(originalNumber + " is an Armstrong number.");
		} else {
			System.out.println(originalNumber + " is not an Armstrong number.");
		}
		sc.close();
	}
}