import java.util.Scanner;

public class question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		int e;
		int largest;
		int smallest;
		
		//Ask user to enter integer
		System.out.println("please Enter your first integer");
		a = sc.nextInt();
		largest=a;
		smallest=a;
		
		//read and update largest integer and smallest integer
		System.out.println("please Enter Second integer");
		b= sc.nextInt();
		if(b>largest) {
			largest=b;
		}else if(b<smallest){
			smallest =b;
			
		}
		System.out.println("please Enter third integer");
		c= sc.nextInt();
		if(c>largest) {
			largest=c;
		}else if(c<smallest){
			smallest =c;
			
		}
		System.out.println("please Enter fourth integer");
		d= sc.nextInt();
		if(d>largest) {
			largest=d;
		}else if(d<smallest){
			smallest =d;
			
		}
		System.out.println("please firth integer");
		e= sc.nextInt();
		if(e>largest) {
			largest=e;
		}else if(e<smallest){
			smallest =e;
			
		}
		
		System.out.printf("Largest integer is %d\n", largest);
		System.out.printf("smallest integer is %d\n", smallest);
		
		sc.close();

	}

}
