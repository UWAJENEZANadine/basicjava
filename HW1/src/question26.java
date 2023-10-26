import java.util.Scanner;

public class question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		
		Scanner sc = new Scanner(System.in);
		
		//ask user to enter two integer
		System.out.println("Please enter your first integer");
		x = sc.nextInt();
		System.out.println("Please enter your second integer");
		y = sc.nextInt();
		
		boolean isMultiple = x % y ==0;
		if(isMultiple) {
			System.out.printf("%d is multiple of %d", y, x);
		}
		else {
			System.out.printf("%d is not multiple %d", y, x);
		}
		

	}

}
