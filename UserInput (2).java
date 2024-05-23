import java.util.Scanner;
public class UserInput{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	int largest = 0;
	int smallest = 1000; 
	
	String choice;
	
	do{
		System.out.print("Enter a Number: ");
		int number = scanner.nextInt();
	
		if(number < smallest){
		smallest = number;
		}
		
		if(number > largest){
		largest = number;
		}

	scanner.nextLine();

	System.out.print("do you want to continue? y/n? ");
	choice = scanner.nextLine();
	
	
	} while(choice.equalsIgnoreCase("Y"));
		System.out.printf("largest number is " + largest);
		System.out.printf("smallest number is " + smallest);


	
		
	}

	
}
