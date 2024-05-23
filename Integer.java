import java.util.Scanner;
public class Integer{
	public static void main(String [] args){

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");	
		int integer = scanner.nextInt();
	
		int hundred = 100;
		int square = integer * integer;

		

		
		if(integer < hundred){
		  System.out.printf("%s%n,The number is lesser!",  "%d < %d%n", integer, hundred);	
		}
		if(integer == hundred){
		  System.out.printf("%d == %d%n", integer, hundred);
		}
		if(integer > hundred){
		  System.out.printf("%d > %d%n", integer, hundred);
		}
		if(integer != hundred){
		  System.out.printf("%d != %d%n", integer, hundred);		
		}
		if(square == hundred){
		  System.out.printf("%d == %d%n", square, hundred);
		}
		if(square > hundred){
		  System.out.printf("%d > %d%n", square, hundred);
		}
		if(square != hundred){
		  System.out.printf("%d != %d%n", integer, hundred);
		}
		if(square < hundred){
		  System.out.printf("%d == %d%n", square, hundred);
		}

		
	}
}
