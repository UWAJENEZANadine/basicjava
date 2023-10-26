import java.util.Scanner;

public class question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner (System.in);
		
		//ask user to enter a number with five digits
		System.out.println("Please enter a number of five digits");
		num = sc.nextInt();
		if(num >= 10000 && num <= 99999) {
			int dig1 = num /10000;
			int dig2 = (num % 10000)/1000;
			int dig3 = (num % 1000)/100;
			int dig4 = (num %100)/10;
			int dig5 = num %10;
			
			System.out.printf("%d   %d   %d   %d   %d",  dig1,  dig2,  dig3,  dig4,  dig5);
			
		}else {
			System.out.println("Please enter a a number with five digit");
		}
		
		
				

	}

}
