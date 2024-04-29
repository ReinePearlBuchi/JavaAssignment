import java.util.Scanner;
public class FunctionsSnacks{


	public static boolean isEven(int number){

		if(number % 2 == 1){
		return false;
		}
		else 
			return true;

	}

	public static boolean isPrimeNumber(int figure){
		for(int i = 2; i < figure ; i++){

		if(figure % i == 0)  return false;

	}
		return true;
		
	
	}

	

	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter a Number :");
	int userinput = scanner.nextInt();

	boolean result = isPrimeNumber(userinput);
	System.out.println(result);
	

	}

	
	

}