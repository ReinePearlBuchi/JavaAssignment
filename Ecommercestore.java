import java.util.Scanner;
	public class Ecommercestore{
		public static void main(String[] args){
		Scanner string = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		

            		double total = 0.0; double discount = 0.01; 

			System.out.print("Welcome to E-store!\n what is your name ? : " );
			String name = string.nextLine();
		
			System.out.print("How many items do you want to buy : " );
			int numberOfItems = number.nextInt();
		

		
			for (int i = 1; i <= numberOfItems ; i++ ){
			System.out.print("name of item "+ i +" you want to buy : ");
			String itemName = string.nextLine();

			System.out.print("Enter price of "+ itemName +  " :$ ");
			double price = number.nextInt();
			total = total + price ; 
			
			}
			
				
			if(total >= 200){
			double discountTotal = total;
			 discountTotal = discountTotal * discount;
			 double newDiscountTotal = total - discountTotal;
			
			System.out.println(" ****************************** ");
				System.out.printf("Name: %s %nNumber of Item: %d %nDiscount: %s %nDiscount Amount: %.2f %nAmount to be paid: %.2f%n ",name,numberOfItems,"10%",discountTotal,newDiscountTotal);

			System.out.println(" ****************************** ");
			}

			


	

	
				
			
	}


	}