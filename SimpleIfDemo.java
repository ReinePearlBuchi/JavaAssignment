
import java.util.Scanner;
	public class SimpleIfDemo{
	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter an Integer: ");
	int number = scanner.nextInt();

	if(number < 10){
		System.out.println("the number is less than 10");	
	}

	if (number % 5 == 0){
		System.out.println("HiFive");
	}

	if (number % 2 == 0){
		System.out.print("HiEven");
	}

	}
}