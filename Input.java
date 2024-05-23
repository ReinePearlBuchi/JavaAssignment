import java.util.Scanner;
public class Input{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a Number: ");
	int firstNumber = scanner.nextInt();

	System.out.print("Enter a Number: ");
	int secondNumber = scanner.nextInt();

	int multiply = firstNumber * secondNumber;
	
		if(multiply < 100 ){
		System.out.print("The multiplication of the Numbers is lesser than 100");
		}			
				
		else{
		System.out.print("The multiplication of the Numbers is greater than 100");
		}



	}



}