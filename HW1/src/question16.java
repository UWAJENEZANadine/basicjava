import java.util.Scanner;

public class question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		
		Scanner sc = new Scanner (System.in);
		
		//ask user to Enter two integer
		System.out.println("Enter your first number");
		a = sc.nextInt();
		System.out.println("Enter your Second number");
		b = sc.nextInt();
		if(a>b) {
			System.out.printf("%d is a larger", a);
			
		}
		if(b>a) {
			System.out.printf("%d is a larger", b);
		}
		else if(a == b) {
			System.out.printf("%d = %d These numbers are equal", a, b);
		}
		sc.close();

	}

}
