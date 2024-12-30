import java.util.Scanner;

public class elseif {

	public static void main(String[] args) {
		System.out.println("Enter The Time :");
		Scanner sc =new Scanner(System.in);
		int time =sc.nextInt();
		if (time < 12) {
		  System.out.println("Good morning.");
			} 
		else if (time < 18) {
		  System.out.println("Good afternoon.");
			} 
		else if (time < 21){
		  System.out.println("Good evening.");
			} 
		else if (time < 25){
			  System.out.println("Good night.");
			}
		else {
			System.out.println("Invalid Time!");
			}
		sc.close();
		
	}

}
