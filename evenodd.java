import java.util.Scanner;

public class evenodd {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number");
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" is an even number");
		}
		else {
			System.out.println(n+" is an odd number");
		}
		sc.close();
	}
}
