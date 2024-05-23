import java.util.Scanner;
	public class Arithmetic{
		public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNumber = scanner.nextInt();
	
		System.out.print("Enter second number: ");
		int secondNumber = scanner.nextInt();
		
	
		int squareOfFirstNumber = firstNumber * firstNumber;
		System.out.println("The Square of first number is : " + squareOfFirstNumber);

		int squareOfSecondNumber = secondNumber * secondNumber;
		System.out.println("The Square of first number is : " + squareOfSecondNumber);

		int sumOfSquareOfNumber = squareOfFirstNumber + squareOfSecondNumber;
		int differenceOfSquareOfNumber = squareOfFirstNumber - squareOfSecondNumber;
		
		System.out.println("The Sum of square of number is : " + sumOfSquareOfNumber );
		System.out.print("The Difference of square Of number " + differenceOfSquareOfNumber);



}


}