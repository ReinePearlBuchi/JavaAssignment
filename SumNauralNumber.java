import java.util.Scanner;
public class SumNauralNumber{
		public static void main(String[] args ){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int sum = 0;
		
			
		for(int count = 1; count <= number; count++){
		sum = sum + count;


		}
		System.out.println("The sum is: "+sum);
		
}
}
	