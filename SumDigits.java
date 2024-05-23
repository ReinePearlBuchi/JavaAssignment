import java.util.Scanner;
	public class SumDigits{
		public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a 3 -digit Number");
		int num = scanner.nextInt();


		int divide = num % 10;
		num = num / 10;
		
		int modulo = num % 10;
		num = num / 10;

		int calculate = num % 10;
		num = num / 10;
		


		int total = divide + modulo + calculate;
		System.out.print(total);
 



	}


}