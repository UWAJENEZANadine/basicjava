import java.util.Scanner;

public class question35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//asks user to enter total miles driven per day
		System.out.println("Please enter a total mile per driven day");
		double totalMilesDriven = sc.nextDouble();
		
		System.out.println("Please enter cost per gallon of gosiline");
		double costPerGallon = sc.nextDouble();
		
		System.out.println("please enter Average mile per gallon");
		double averageMilePerGallon = sc.nextDouble();
		
		System.out.println("Please enter parking fees per galon");
		double parkingFees = sc.nextDouble();
		
		System.out.println("Please enter tolls per day");
		double tollsPerDay = sc.nextDouble();
		
		
		//calculation for cost per day 
		double fuelCost = (totalMilesDriven/averageMilePerGallon)* costPerGallon;
		double totalCost = fuelCost + parkingFees + tollsPerDay;
		
		
		System.out.printf("The daily driving cost %f", totalCost); 

	}

}
