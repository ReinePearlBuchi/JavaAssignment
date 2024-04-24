import java.util.Scanner;
	public class Discountp{
		public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);


 		System.out.print("Enter a number: ");
		int Number = scanner.nextInt();

		System.out.print("Enter a discount: ");
		int Number2 = scanner.nextInt();

		float Sum = Number * Number2 / 100 ;
		float Total = Sum - Number;
		System.out.print(Total);
		
		
		

		}
	}