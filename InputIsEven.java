import java.util.Scanner;
public class InputIsEven {

		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);

			System.out.print("Enter an Even Number : ");
			int number = scanner.nextInt();

			if(number % 2 == 0){
				System.out.println("true");
							}

		}	
	}
