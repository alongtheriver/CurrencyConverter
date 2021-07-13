package projects;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		
	   // Scanning user's input
		Scanner cin = new Scanner(System.in);
		
		double USD = 1.00;
		double KRW = 1146.86;
		double GBP = 0.72;
		
		double USD2 = 0.00087;
		double KRW2 = 1000.00;
		double GBP2 = 0.00063;
		
		double USD3 = 1.39;
		double KRW3 = 1592.60;
		double GBP3 = 1;
		
		System.out.println("====================================================");
		
		System.out.println("Which currency do you want to use: \n USD \n GBP \n KRW");
		String choice01 = cin.next();
		
		System.out.println("Which currency do you want to convert to: \n a - KRW \n b - USD \n c - GBP");
		String choice02 = cin.next();
		
		System.out.println("How much do you want to convert?");
		double input = cin.nextDouble();
		
		if (choice01.equalsIgnoreCase("USD") && choice02.equalsIgnoreCase("a")) {
			
			double result01 = input * KRW;
			System.out.println(result01); 
			
		} else if (choice01.equalsIgnoreCase("USD") && choice02.equalsIgnoreCase("c")) {
			
			double result02 = input * GBP;
			System.out.println(result02);
			
		} else if (choice01.equalsIgnoreCase("KRW") && choice02.equalsIgnoreCase("b")) {
			
			double result03 = input * USD2;
			System.out.println(result03);
			
		} else if (choice01.equalsIgnoreCase("KRW") && choice02.equalsIgnoreCase("c")) {
			
			double result04 = input * GBP2;
			System.out.println(result04);
			
		} else if (choice01.equalsIgnoreCase("GBP") && choice02.equalsIgnoreCase("a")) {
			
			double result05 = input * KRW3;
			System.out.println(result05);
			
		} else if (choice01.equalsIgnoreCase("GBP") && choice02.equalsIgnoreCase("b")) {
			
			double result06 = input * USD3;
			System.out.println(result06);
			
		} else {
			System.out.println("You did not enter a valid number.");
		}
		
		
	}
  
        

}
