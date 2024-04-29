import java.util.Scanner;
	public class CheckoutApp{
		public static void main(String[] args){

			Scanner scanner = new Scanner(System.in);

			System.out.println("What is the Customer's Name");
			String nomme =  scanner.nextLine();
			
			System.out.println("What did the user buy? ");
			String achat =  scanner.nextLine();
			
			System.out.println("How many pieces? ");
			int quantite =  scanner.nextInt();
		
			System.out.println("Add more items? ");
			boolean ajoute =  scanner.nextBoolean();
			
			System.out.println("What did the user buy ");
			String achat1 =  scanner.nextLine();
			
			System.out.println("How many pieces? ");
			int ajoute1 =  scanner.nextInt();

			System.out.println("How much per unit? ");
			int commebien =  scanner.nextInt();

			System.out.println("Add more items? ");
			boolean ajoute2 =  scanner.nextBoolean();
			
			System.out.println("What is your name? ");
			String prenom =  scanner.nextLine();
			
			System.out.println("How much discount will he get");
			int remise =  scanner.nextInt();


			


			



	}
}
