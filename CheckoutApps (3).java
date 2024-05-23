import java.util.Scanner;
	public class CheckoutApps{
		public static void main(String[] args){

			Scanner scanner = new Scanner(System.in);


			System.out.println("What is the Customer's Name");
			String nomme =  scanner.nextLine();

			String response = "";

			
			
		do{
			


			
			
			System.out.println("What did the user buy? ");
			String achat =  scanner.next();
			
			System.out.println("How many pieces? ");
			int quantite =  scanner.nextInt();
		
			System.out.println("Add more items? ");
			String ajoute =  scanner.next();





		}while(!response.equals("no"));

			System.out.println("What is the cashier's Name: ");
			String cashiersName = scanner.next();

			System.out.println("How much discount will the customer get");
			int discount = scanner.nextInt();


			System.out.print("%nSEMICOLON STORES%nMAIN BRANCH%nLOCATION: 312, herbert macauly way, yaba, Lagos%nTEL:03293828343%ndate:18-			Dec-2022 8:48:11pm%nCashier : Cashier Name%nCustomer's Name: Chukwuma Adekunle Ciroma");
			
			
			
		
			


			



	}
}
