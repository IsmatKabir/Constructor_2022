package basicConcept;

import java.util.Scanner;

public class Scpractice {

	

	public static void main(String[] args) {
		
	Scanner	scan= new Scanner(System.in);
		
		
		System.out.println("-----------fresh food bazar-------------");
		System.out.println("-----------45, Woodside avenue----------");
		System.out.println("------------Elmhurst,Ny------------------");
		System.out.println("-------------718 453 2243----------------");
		System.out.println("List of item");
		System.out.println("Quantity of Nutella");
		int qNut=scan.nextInt();
		System.out.println("Price of Nutella");
		double pNut=scan.nextDouble();
		double totalPriceNutella=qNut*pNut;
		System.out.println("Total price of Nutella =$"    +totalPriceNutella );
		System.out.println("Quantity of Straberry box");
		int qStrawberry=scan.nextInt();
		System.out.println("Price of Starberry box");
		double pStrawberry=scan.nextDouble();
		double totalStrawberryPrice=qStrawberry*pStrawberry;
		System.out.println("total price of strawberry$="   + totalStrawberryPrice);
		double subTotal=totalPriceNutella+totalStrawberryPrice;
		System.out.printf("subtotal=$%.2f\n" ,subTotal  );
		double stax= .0887;
		
		System.out.printf("tax is=$%,2f\n"  ,stax    );
		double totalTax=subTotal*stax;
		System.out.printf("total tax is =$%.2f\n" ,totalTax  );
		double totalAfterTax=    subTotal + totalTax;
		System.out.printf("total after tax=$%.2f\n" , totalAfterTax );
		// what is scanner
		// scanner is a class from jdk
		 // java.util package is used to obtain the input from user in the system2
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
