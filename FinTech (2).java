import java.util.Scanner;
	public class FinTech{
		public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Amount you will like to borrow: ");
		int Principal = scanner.nextInt();

		System.out.print("Enter the Duration: ");
		int Duration = scanner.nextInt();

		System.out.print("Enter the Interest Rate: ");
		int AnnualInterestRate = scanner.nextInt();
		
		
		int durationInYear = 12 * Duration;
		int monthsInAYear = 365;

		int percentageMonthlyRate = AnnualInterestRate * 100 / durationInYear * monthsInAYear ;
	
		
		
		System.out.printf( "The monthly refund is %d ", percentageMonthlyRate);
		





		}
	



	}