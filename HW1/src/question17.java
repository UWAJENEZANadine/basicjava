import java.util.Scanner;

public class question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		int z;
		
		Scanner sc = new Scanner(System.in);
		//ask user to enter a number
		
		System.out.println("Enter your first number");
		x = sc.nextInt();
		System.out.println("Enter your second number");
		y = sc.nextInt();
		System.out.println("Enter your Third number");
		z = sc.nextInt();
		
		int sum = x + y + z;
		int average = sum /3;
		int product = x * y * z;
		
		int smallest = x;
		int largest = x;
				
		
		if(y>largest ) {
			largest = y;
		}
	    if(z>largest ) {
			largest = z;
		}
		if(y<smallest ) {
			smallest = y;
		}
		if(z<smallest ) {
			smallest = z;
		}
	
		System.out.printf("The sum of entered number is:%d\n",sum);
		System.out.printf("The Average of entered number is:%d\n",average);
		System.out.printf("The product of entered number is:%d\n",product);
		System.out.printf("The largest of entered number is:%d\n",largest);
		System.out.printf("The smallest of entered number is:%d\n",smallest);

	}

}
