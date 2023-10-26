import java.util.Scanner;

public class question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		
		
		Scanner sc = new Scanner(System.in);
		
		//ask the user to enter a number to determine if is odd or even
		System.out.println("Please enter number 1:");
		num1 = sc.nextInt();
		
		if(num1%2==0) {
			System.out.printf("%d is even", num1);
		}
		else {
			System.out.printf("%d is odd", num1);
			
		}
		
		
		

	}

}
