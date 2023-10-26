import java.util.*;
public class question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		
		Scanner src= new Scanner(System.in);
		
		//ask user to enter a number
		System.out.println("Pleaser enter your First number");
		num1 = src.nextInt();
		System.out.println("Please enter your Second number");
		num2 =  src.nextInt();
		
		int sum = num1 + num2;
		System.out.printf("The sum of your entered integer is:%d\n", sum);
		int product = num1 * num2;
		System.out.printf("The product of your entered integer is:%d\n", product);
		int difference = num1 - num2;
		System.out.printf("The difference of your entered integer is:%d\n", difference);
		
		if (num2!=0) {
			int quotient = num1 / num2;
			System.out.printf("The quotient of your entered integer is:%d", quotient);
			
		}
		else {
			System.out.println("The quotient failed");
		}
		
		src.close();

	}

}
