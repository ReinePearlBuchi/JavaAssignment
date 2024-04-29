import java.util.Scanner;
	public class ArithmeticSmallestLargest{
		 public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	int total =0;

	for (int buchi =0; buchi < 10; buchi++){
	
	System.out.print("Enter Number " + (buchi + 1) +  ":");
	int Number = scanner.nextInt();
	 total+= Number;
}

	System.out.print("The Average of the Number is: " + total / 10 );
	
	
	 
	

	}
		}
	