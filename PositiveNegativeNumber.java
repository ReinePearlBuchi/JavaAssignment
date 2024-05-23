import java.util.Scanner;
	public class PositiveNegativeNumber{
		public static void main(String[] args){
		Scanner scanner = new scanner(System.in);

		int positiveNumber = 0;
		int negativeNumber =0;
		int zeroCount++;
		
		char choice;

		

		do{
		System.out.print("Enter a number"); 
		int number = scanner.nextInt();

		
		if (number > 0)
			positiveNumber++;
		else if (number < 0)
			negativeNumber++;
		else
			zeroCount++;


		choice = scanner.next().charAt(0);
		}while( choice == "Y" || choice == "y")

		
		System.out.print("Positive numbers entered: " positiveNumber );
		System.out.print("Negative numbers entered: " negativeNumber );
		System.out.print("zeroes entered: " + zero++);

		scanner.close();



	}




}


}