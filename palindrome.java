import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int r, sum = 0, a, b;
		System.out.println("Enter a Number to check Palindrome :");
		Scanner sc =new Scanner(System.in);
		a =sc.nextInt();
		b = a;
		while (a > 0) {
			r = a % 10;
			sum = (sum * 10) + r;
			a = a / 10;
		}
		if (b == sum)
			System.out.println(b+ " is a Palindrome number ");
		else
			System.out.println(b+ " is not a Palindrome number");
		sc.close();
	}
}